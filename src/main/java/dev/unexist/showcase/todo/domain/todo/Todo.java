/**
 * @package Quarkus-Arch-Testing-Showcase
 *
 * @file Todo class and aggregate root
 * @copyright 2020-present Christoph Kappel <christoph@unexist.dev>
 * @version $Id$
 *
 * This program can be distributed under the terms of the Apache License v2.0.
 * See the file LICENSE for details.
 **/

package dev.unexist.showcase.todo.domain.todo;

import org.jmolecules.architecture.layered.DomainLayer;
import org.jmolecules.ddd.annotation.AggregateRoot;
import org.jqassistant.contrib.plugin.ddd.annotation.DDD;

@DDD.AggregateRoot
@DDD.Layer.DomainLayer
@AggregateRoot
@DomainLayer
public class Todo extends TodoBase {
    private int id;

    /**
     * Constructor
     **/

    public Todo() {
    }

    /**
     * Constructor
     *
     * @param base
     *         Base entry
     **/

    public Todo(final TodoBase base) {
        this.update(base);
    }

    /**
     * Update values from base
     *
     * @param base
     *         Todo base class
     **/

    public void update(final TodoBase base) {
        this.setTitle(base.getTitle());
        this.setDescription(base.getDescription());
        this.setDone(base.getDone());

        if (null != base.getDueDate()) {
            this.setDueDate(base.getDueDate());
        }
    }

    /**
     * Get id of entry
     *
     * @return Id of the entry
     **/

    public int getId() {
        return id;
    }

    /**
     * Set id of entry
     *
     * @param id
     *         Id of the entry
     **/

    public void setId(int id) {
        this.id = id;

    }
}
