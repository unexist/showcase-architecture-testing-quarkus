/**
 * @package Quarkus-jqAssistant-Showcase
 *
 * @file Unused util
 * @copyright 2019 Christoph Kappel <unexist@subforge.org>
 * @version $Id$
 *
 * This program can be distributed under the terms of the GNU GPLv2.
 * See the file COPYING for details.
 **/

package dev.unexist.showcase.todo.infrastructure.util.cycle.slice2;

import dev.unexist.showcase.todo.infrastructure.util.cycle.slice1.UnusedCycleA;

public class UnusedCycleB {
    private UnusedCycleA unusedCycleA;

    public UnusedCycleB() {
        this.unusedCycleA = new UnusedCycleA();
    }
}
