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

package dev.unexist.showcase.todo.infrastructure.util;

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
