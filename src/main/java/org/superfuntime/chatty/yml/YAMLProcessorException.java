/*
 * An easily extendable chat bot for any chat service.
 * Copyright (C) 2013 bogeymanEST
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


package org.superfuntime.chatty.yml;

/**
 * YAMLProcessor exception.
 * <p/>
 * Code from <a href="https://github.com/Spoutcraft/LegacyLauncher">Spoutcraft Launcher</a>
 */
public class YAMLProcessorException extends Exception {
    private static final long serialVersionUID = -2442886939908724203L;

    public YAMLProcessorException() {
        super();
    }

    public YAMLProcessorException(String msg) {
        super(msg);
    }
}