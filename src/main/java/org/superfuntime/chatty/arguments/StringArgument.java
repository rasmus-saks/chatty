/*
 * An easily extendable chat bot for any chat service.
 * Copyright (C) 2015 bogeymanEST
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along
 * with this program; if not, write to the Free Software Foundation, Inc.,
 * 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
 */

package org.superfuntime.chatty.arguments;

import java.util.Scanner;

/**
 * A string value. Reads until the next whitespace (space, new line, etc) unless it is surrounded by double-quotes.
 * <p/>
 * To get everything to the end of the line, see {@link AllArgument}.
 */
public class StringArgument implements ArgumentParser<String> {
    @Override
    public String parse(Scanner scanner) {
        String str = scanner.next();
        if (str.startsWith("\"") && !str.endsWith("\"")) {
            str += scanner.findInLine("[^\"]*\"");
            str = str.replace("\"", "");
        }
        return str;
    }

    @Override
    public String getUsage() {
        return "a string";
    }
}
