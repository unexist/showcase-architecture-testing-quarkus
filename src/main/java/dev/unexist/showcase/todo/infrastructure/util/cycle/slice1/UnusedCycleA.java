/**
 * @package Quarkus-Arch-Testing-Showcase
 *
 * @file Unused util
 * @copyright 2020-2021 Christoph Kappel <christoph@unexist.dev>
 * @version $Id$
 *
 * This program can be distributed under the terms of the GNU GPLv3.
 * See the file LICENSE for details.
 **/

package dev.unexist.showcase.todo.infrastructure.util.cycle.slice1;

import dev.unexist.showcase.todo.infrastructure.util.cycle.slice2.UnusedCycleB;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import org.jmolecules.architecture.layered.InfrastructureLayer;
import org.jqassistant.contrib.plugin.ddd.annotation.DDD;

@DDD.Layer.InfrastructureLayer
@InfrastructureLayer
public class UnusedCycleA {
    @SuppressFBWarnings("URF_UNREAD_FIELD")
    @SuppressWarnings("unused")
    private UnusedCycleB unusedCycleB;

    public UnusedCycleA() {
        this.unusedCycleB = new UnusedCycleB();
    }
}
