/**
 * @package Quarkus-jqAssistant-Showcase
 *
 * @file Contrived tests with ArchUnit
 * @copyright 2019 Christoph Kappel <unexist@subforge.org>
 * @version $Id$
 *
 * This program can be distributed under the terms of the GNU GPLv2.
 * See the file COPYING for details.
 **/

package org.subforge.showcase.todo.domain.model;

import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.core.importer.ClassFileImporter;
import com.tngtech.archunit.junit.AnalyzeClasses;
import jdk.nashorn.internal.ir.annotations.Ignore;
import org.junit.jupiter.api.Test;

@AnalyzeClasses(packages = "org.subforge.showcase")
public class CyclesArchUnitTest {
    private final JavaClasses classes = new ClassFileImporter().importPackages("org.subforge");

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
