/**
 * @package Quarkus-Arch-Testing-Showcase
 *
 * @file Package info for JavaDoc
 * @copyright 2020-2021 Christoph Kappel <christoph@unexist.dev>
 * @version $Id$
 *
 * This program can be distributed under the terms of the GNU GPLv3.
 * See the file LICENSE for details.
 **/

@DDD.BoundedContext(name = "Todo", dependsOn = { "OtherBC" })
package dev.unexist.showcase.todo.domain.todo;

import org.jqassistant.contrib.plugin.ddd.annotation.DDD;
