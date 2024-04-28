package com.aynor.menu;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;

public class MacOSMenuSetup implements MenuSetup {
    @Override
    public void setupMenu(JFrame mainFrame) {
        // JMenuBar menuBar = new JMenuBar();
        // JMenu fileMenu = new JMenu("File");
        // menuBar.add(fileMenu);
        // mainFrame.setJMenuBar(menuBar);

        System.out.println("---\n Operating System: " + System.getProperty("os.name") + "\n---");

        // 使用 CommonMenuSetup 类来设置菜单
        CommonMenuSetup.setupCommonMenu(mainFrame);

        System.out.println("---\n MacOSMenuSetup 已加载 \n---");

    }
}
