/**
 * @package Quarkus-Arch-Testing-Showcase
 *
 * @file Todo base class
 * @copyright 2020-2021 Christoph Kappel <christoph@unexist.dev>
 * @version $Id$
 *
 * This program can be distributed under the terms of the GNU GPLv3.
 * See the file LICENSE for details.
 **/

package dev.unexist.showcase.todo.domain.todo;

import org.jmolecules.architecture.layered.DomainLayer;
import org.jmolecules.ddd.annotation.Entity;
import org.jqassistant.contrib.plugin.ddd.annotation.DDD;

import javax.validation.constraints.NotBlank;

@DDD.Entity
@DDD.Layer.DomainLayer
@Entity
@DomainLayer
public class TodoBase {

    @NotBlank
    private String title;

    @NotBlank
    private String description;

    private Boolean done;

    @NotBlank
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

        if (null != dueDate.getStart() && null != dueDate.getDue()) {
            this.done = dueDate.getStart().isBefore(dueDate.getDue());
        }
    }
}
