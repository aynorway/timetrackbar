package com.aynor.menu;

import javax.swing.JFrame;

public class MacOSMenuSetup implements MenuSetup {
    @Override
    public void setupMenu(JFrame mainFrame) {

        System.out.println("---\n Operating System: \n " + System.getProperty("os.name") + "\n---");

        // 使用APPLE的MenuBar
        System.setProperty("apple.laf.useScreenMenuBar", "true");
        // 使用 CommonMenuSetup 类来设置菜单
        CommonMenuSetup.setupCommonMenu(mainFrame);

        System.out.println("---\n MacOSMenuSetup 已加载 \n---");

    }
}
