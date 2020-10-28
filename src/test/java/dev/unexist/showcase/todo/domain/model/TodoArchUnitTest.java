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

package dev.unexist.showcase.todo.domain.model;

import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;
import net.jqwik.api.Property;
import org.slf4j.Logger;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;
import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.fields;
import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.methods;

@AnalyzeClasses(packages = "dev.unexist.showcase")
public class TodoArchUnitTest {

    @ArchTest
    static final ArchRule testShouldBePrefixedWithTest =
            methods()
                .that()
                    .areAnnotatedWith(Property.class)
                .should()
                    .haveNameMatching("^test.*")
                .because("Test classes must be prefixed with 'Test'");

    @ArchTest
    static final ArchRule loggersShouldBeStaticAndPrivate =
            fields()
                .that()
                    .haveRawType(Logger.class)
                .should()
                    .bePrivate()
                    .andShould().beStatic()
                    .andShould().beFinal()
                .because("Loggers have to be that way");

    @ArchTest
    static final ArchRule checkPlacement =
            classes()
                .that()
                    .resideInAnyPackage("..test..")
                .should()
                    .bePublic();
}
