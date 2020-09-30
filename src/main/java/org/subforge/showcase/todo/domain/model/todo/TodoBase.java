/**
 * @package Quarkus-jqAssistant-Showcase
 *
 * @file Todo base class
 * @copyright 2019 Christoph Kappel <unexist@subforge.org>
 * @version $Id$
 *
 * This program can be distributed under the terms of the GNU GPLv2.
 * See the file COPYING for details.
 **/

package org.subforge.showcase.todo.domain.model.todo;

import org.jqassistant.contrib.plugin.ddd.annotation.DDD;

import javax.validation.constraints.NotNull;

@DDD.Entity
@DDD.Layer.DomainLayer
public class TodoBase {

    @NotNull
    private String title;

    @NotNull
    private String description;

    private Boolean done;

    @NotNull
    private DueDate dueDate;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getDone() {
        return done;
    }

    public void setDone(Boolean done) {
        this.done = done;
    }

    public DueDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(DueDate dueDate) {
        this.dueDate = dueDate;

        if (null != dueDate.getStart() && null != dueDate.getDue()){
            this.done = dueDate.getStart().isBefore(dueDate.getDue());
        }
    }
}
