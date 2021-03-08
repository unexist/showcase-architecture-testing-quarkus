/**
 * @package Quarkus-Arch-Testing-Showcase
 *
 * @file Unused util
 * @copyright 2020-2021 Christoph Kappel <christoph@unexist.dev>
 * @version $Id$
 *
 * This program can be distributed under the terms of the GNU GPLv2.
 * See the file LICENSE for details.
 **/

package dev.unexist.showcase.todo.infrastructure.util;

import org.jmolecules.architecture.layered.InfrastructureLayer;
import org.jqassistant.contrib.plugin.ddd.annotation.DDD;

@DDD.Layer.InfrastructureLayer
@InfrastructureLayer
public class UnusedUtil {

    /**
     * Util to do something nasty
     *
     * @param stopAfter
     *          Stop after n-th loops
     **/

    public static void recursive(int stopAfter) {
        if (0 < stopAfter) {
            recursive(stopAfter - 1);
        }
    }
}
