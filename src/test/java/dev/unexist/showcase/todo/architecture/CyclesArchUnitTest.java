/**
 * @package Quarkus-Arch-Testing-Showcase
 *
 * @file Contrived tests with ArchUnit
 * @copyright 2020-2021 Christoph Kappel <christoph@unexist.dev>
 * @version $Id$
 *
 * This program can be distributed under the terms of the GNU GPLv3.
 * See the file LICENSE for details.
 **/

package dev.unexist.showcase.todo.architecture;

import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.core.importer.ClassFileImporter;
import com.tngtech.archunit.junit.AnalyzeClasses;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static com.tngtech.archunit.library.dependencies.SlicesRuleDefinition.slices;

@AnalyzeClasses(packages = "dev.unexist.showcase")
public class CyclesArchUnitTest {
    private final JavaClasses classes = new ClassFileImporter().importPackages("dev.unexist");

    @Test
    @Disabled
    public void testNoCyclesBetweenSlices() {
        slices()
                .matching("..(cycle).(*)..")
                    .namingSlices("$2 of $1")
                .should()
                    .beFreeOfCycles()
                .check(classes);
    }
}
