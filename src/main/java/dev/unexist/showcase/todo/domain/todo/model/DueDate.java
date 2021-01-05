/**
 * @package Quarkus-Arch-Testing-Showcase
 *
 * @file DueDate class
 * @copyright 2020 Christoph Kappel <christoph@unexist.dev>
 * @version $Id$
 *
 * This program can be distributed under the terms of the GNU GPLv2.
 * See the file COPYING for details.
 **/

package dev.unexist.showcase.todo.domain.todo.model;

import org.jqassistant.contrib.plugin.ddd.annotation.DDD;

import java.time.LocalDate;

@DDD.ValueObject
public class DueDate {
    private LocalDate start;
    private LocalDate due;

    public LocalDate getStart() {
        return start;
    }

    public void setStart(LocalDate start) {
        this.start = start;
    }

    public LocalDate getDue() {
        return due;
    }

    public void setDue(LocalDate due) {
        this.due = due;
    }
}
