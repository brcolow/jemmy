/*
 * Copyright (c) 2017, Oracle and/or its affiliates. All rights reserved.
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
package org.netbeans.jemmy.operators;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import java.awt.Dimension;
import java.io.File;

public class FileChooserApp extends JFrame {
    public FileChooserApp(File path) {
        super("Sample File Chooser");
        JFileChooser externalChooser = new JFileChooser(new File("."));
        externalChooser.setCurrentDirectory(path);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(800, 600));
        pack();
        setLocationRelativeTo(null);
        getContentPane().add(externalChooser);
    }
    public static void main(String[] args) {
        show((args.length >= 1) ? new File(args[0]) : new File(System.getProperty("user.dir")));
    }

    public static void show(File path) {
        new FileChooserApp(path).setVisible(true);
    }
}
