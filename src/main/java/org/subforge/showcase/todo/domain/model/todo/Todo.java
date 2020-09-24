/**
 * @package Quarkus-jqAssistant-Showcase
 *
 * @file Todo class and aggregate root
 * @copyright 2019 Christoph Kappel <unexist@subforge.org>
 * @version $Id$
 *
 * This program can be distributed under the terms of the GNU GPLv2.
 * See the file COPYING for details.
 **/

package org.subforge.showcase.todo.domain.model.todo;

import org.jqassistant.contrib.plugin.ddd.annotation.DDD;

@DDD.AggregateRoot
public class Todo extends TodoBase {
    private int id;

    public Todo() {
    }

    public Todo(final TodoBase base) {
        this.update(base);
    }

    public void update(final TodoBase base) {
        this.setDueDate(base.getDueDate());
        this.setTitle(base.getTitle());
        this.setDescription(base.getDescription());
        this.setDone(base.getDone());
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
