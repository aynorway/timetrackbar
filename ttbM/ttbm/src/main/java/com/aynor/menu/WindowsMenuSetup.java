package com.aynor.menu;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;

public class WindowsMenuSetup implements MenuSetup {
    @Override
    public void setupMenu(JFrame mainFrame) {
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        menuBar.add(fileMenu);
        mainFrame.setJMenuBar(menuBar);

        System.out.println("---\n WindowsMenuSetup 已加载 \n---");
    }
}

