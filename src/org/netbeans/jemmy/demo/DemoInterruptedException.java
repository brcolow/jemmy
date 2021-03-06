/*
 * Copyright (c) 1997, 2016, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */

package org.netbeans.jemmy.demo;

import java.io.PrintStream;

import org.netbeans.jemmy.TestCompletedException;

/**
 *
 * Exception is throught if test (demo) execution has been interrupted
 * (CommentWindow.isInterrupted() returned true).
 *
 * @author Alexandre Iline (alexandre.iline@oracle.com)
 *
 */

public class DemoInterruptedException extends TestCompletedException {

    /**
     * Constructs a DemoInterruptedException object.
     * @param description an exception descriptio.
     */
    public DemoInterruptedException(String description) {
        super(100, description);
    }

    public void printStackTrace() {
        printStackTrace(System.out);
    }

    public void printStackTrace(PrintStream ps) {
        super.printStackTrace(ps);
    }
}
