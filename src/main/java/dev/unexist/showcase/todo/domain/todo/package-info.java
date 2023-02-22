/**
 * @package Quarkus-Arch-Testing-Showcase
 *
 * @file Package info for JavaDoc
 * @copyright 2020-present Christoph Kappel <christoph@unexist.dev>
 * @version $Id$
 *
 * This program can be distributed under the terms of the Apache License v2.0.
 * See the file LICENSE for details.
 **/

@DDD.BoundedContext(name = "Todo", dependsOn = { "OtherBC" })
package dev.unexist.showcase.todo.domain.todo;

import org.jqassistant.contrib.plugin.ddd.annotation.DDD;
