/**
 * @package Quarkus-Arch-Testing-Showcase
 *
 * @file Layer Tests
 * @copyright 2020-2021 Christoph Kappel <christoph@unexist.dev>
 * @version $Id$
 *
 * This program can be distributed under the terms of the Apache License v2.0.
 * See the file LICENSE for details.
 **/

package dev.unexist.showcase.todo.architecture.archunit;

import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.core.importer.ClassFileImporter;
import com.tngtech.archunit.junit.AnalyzeClasses;
import org.junit.jupiter.api.Test;

import static com.tngtech.archunit.library.Architectures.layeredArchitecture;

@AnalyzeClasses(packages = "dev.unexist.showcase")
public class LayerArchUnitTest {
    private final JavaClasses classes = new ClassFileImporter().importPackages("dev.unexist");

    @Test
    public void shoundVerifyLayeredArchitecture() {
        layeredArchitecture()
                .layer("Application")
                .definedBy("..application..")
            .layer("Model")
                .definedBy("..model..")
            .layer("Service")
                .definedBy("..service..")
            .layer("Repository")
                .definedBy("..repository..")
            .layer("Infrastructure")
                .definedBy("..infrastructure..")

            .whereLayer("Application")
                .mayNotBeAccessedByAnyLayer()
            .whereLayer("Service")
                .mayOnlyBeAccessedByLayers("Application")
            .whereLayer("Model")
                .mayOnlyBeAccessedByLayers("Application", "Service", "Repository")
            .whereLayer("Repository")
                .mayOnlyBeAccessedByLayers("Service")
            .whereLayer("Infrastructure")
                .mayOnlyBeAccessedByLayers("Application", "Service", "Repository")
            .check(classes);
    }
}
