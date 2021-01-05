/**
 * @package Quarkus-Arch-Testing-Showcase
 *
 * @file Package info for JavaDoc
 * @copyright 2020 Christoph Kappel <christoph@unexist.dev>
 * @version $Id$
 *
 * This program can be distributed under the terms of the GNU GPLv2.
 * See the file COPYING for details.
 **/

@DDD.BoundedContext(name = "OtherBC", dependsOn = { "Todo" })
package dev.unexist.showcase.todo.domain.otherbc;

import org.jqassistant.contrib.plugin.ddd.annotation.DDD;