/**
 * @package Quarkus-Arch-Testing-Showcase
 *
 * @file Contrived tests with ArchUnit
 * @copyright 2020 Christoph Kappel <christoph@unexist.dev>
 * @version $Id$
 *
 * This program can be distributed under the terms of the GNU GPLv2.
 * See the file COPYING for details.
 **/

package dev.unexist.showcase.todo.domain.todo.model;

import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.core.importer.ClassFileImporter;
import com.tngtech.archunit.junit.AnalyzeClasses;
import jdk.nashorn.internal.ir.annotations.Ignore;
import org.junit.jupiter.api.Test;

@AnalyzeClasses(packages = "dev.unexist.showcase")
public class CyclesArchUnitTest {
    private final JavaClasses classes = new ClassFileImporter().importPackages("dev.unexist");

    @Test
    @Ignore
    public void testNoCyclesBetweenSlices() {
        /*slices()
                .matching("..(cycle).(*)..")
                    .namingSlices("$2 of $1")
                .should()
                    .beFreeOfCycles()
                .check(classes);*/
    }
}
