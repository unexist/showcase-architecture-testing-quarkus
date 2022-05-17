/**
 * @package Quarkus-Arch-Testing-Showcase
 *
 * @file Contrived tests with JDepend
 * @copyright 2020-2021 Christoph Kappel <christoph@unexist.dev>
 * @version $Id$
 *
 * This program can be distributed under the terms of the Apache License v2.0.
 * See the file LICENSE for details.
 **/

package dev.unexist.showcase.todo.architecture;

import jdepend.framework.JDepend;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;

public class CyclesJDependTest {

    @Test
    public void testCycles() throws IOException {
        JDepend jdepend = new JDepend();
        jdepend.addDirectory("target/classes");

        jdepend.analyze();

        assertThat(jdepend.containsCycles()).isFalse();
    }
}
