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

package org.subforge.showcase.todo.infrastructure.util.cycle.slice1;

import org.subforge.showcase.todo.infrastructure.util.cycle.slice2.UnusedCycleB;

public class UnusedCycleA {
    private UnusedCycleB unusedCycleB;

    public UnusedCycleA() {
        this.unusedCycleB = new UnusedCycleB();
    }
}
