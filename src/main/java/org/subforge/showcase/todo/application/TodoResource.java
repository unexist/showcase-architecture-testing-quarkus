/**
 * @package Quarkus-jqAssistant-Showcase
 *
 * @file Todo resource
 * @copyright 2019 Christoph Kappel <unexist@subforge.org>
 * @version $Id$
 *
 * This program can be distributed under the terms of the GNU GPLv2.
 * See the file COPYING for details.
 **/

package org.subforge.showcase.todo.application;

import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.enums.SchemaType;
import org.eclipse.microprofile.openapi.annotations.media.Content;
import org.eclipse.microprofile.openapi.annotations.media.Schema;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponse;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponses;
import org.jqassistant.contrib.plugin.ddd.annotation.DDD;
import org.subforge.showcase.todo.domain.model.todo.Todo;
import org.subforge.showcase.todo.domain.model.todo.TodoBase;
import org.subforge.showcase.todo.domain.service.todo.TodoService;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;
import java.util.Optional;

@Path("/todo")
@DDD.Layer.ApplicationLayer
public class TodoResource {

    @Inject
    TodoService todoService;

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Operation(summary = "Create new todo")
    @APIResponses({
            @APIResponse(responseCode = "201", description = "Todo created"),
            @APIResponse(responseCode = "406", description = "Bad data"),
            @APIResponse(responseCode = "500", description = "Server error")
    })
    public Response create(TodoBase base) {
        Response.ResponseBuilder response;

        if (this.todoService.create(base)) {
            response = Response.status(Response.Status.CREATED);
        } else {
            response = Response.status(Response.Status.NOT_ACCEPTABLE);
        }

        return response.build();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Operation(summary = "Get all todos")
    @APIResponses({
            @APIResponse(responseCode = "200", description = "List of todo", content =
                @Content(schema = @Schema(type = SchemaType.ARRAY, implementation = Todo.class))),
            @APIResponse(responseCode = "204", description = "Nothing found"),
            @APIResponse(responseCode = "500", description = "Server error")
    })
    public Response getAll() {
        List<Todo> todoList = this.todoService.getAll();

        Response.ResponseBuilder response;

        if (todoList.isEmpty()) {
            response = Response.noContent();
        } else {
            response = Response.ok(Entity.json(todoList));
        }

        return response.build();
    }

    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    @Operation(summary = "Get todo by id")
    @APIResponses({
            @APIResponse(responseCode = "200", description = "Todo found", content =
                @Content(schema = @Schema(implementation = Todo.class))),
            @APIResponse(responseCode = "404", description = "Todo not found"),
            @APIResponse(responseCode = "500", description = "Server error")
    })
    public Response getAll(@PathParam("id") int id) {
        Optional<Todo> result = this.todoService.findById(id);

        Response.ResponseBuilder response;

        if (result.isPresent()) {
            response = Response.ok(Entity.json(result.get()));
        } else {
            response = Response.status(Response.Status.NOT_FOUND);
        }

        return response.build();
    }

    @PUT
    @Path("{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Operation(summary = "Update todo by id")
    @APIResponses({
            @APIResponse(responseCode = "204", description = "Todo updated"),
            @APIResponse(responseCode = "404", description = "Todo not found"),
            @APIResponse(responseCode = "500", description = "Server error")
    })
    public Response update(@PathParam("id") int id, TodoBase base) {
        Response.ResponseBuilder response;

        if (this.todoService.update(id, base)) {
            response = Response.noContent();
        } else {
            response = Response.status(Response.Status.NOT_FOUND);
        }

        return response.build();
    }

    @DELETE
    @Path("{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Operation(summary = "Delete todo by id")
    public Response delete(@PathParam("id") int id, TodoBase base) {
        Response.ResponseBuilder response;

        if (this.todoService.delete(id)) {
            response = Response.noContent();
        } else {
            response = Response.status(Response.Status.NOT_FOUND);
        }

        return response.build();
    }
}