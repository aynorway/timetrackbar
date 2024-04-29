package com.aynor.menu.menusetup;

import javax.swing.JFrame;

public class WindowsMenuSetup implements MenuSetup {
    @Override
    public void setupMenu(JFrame mainFrame) {

        System.out.println("---\n Operating System: \n " + System.getProperty("os.name") + "\n---");

        // 使用 CommonMenuSetup 类来设置菜单
        CommonMenuSetup.setupCommonMenu(mainFrame);

        System.out.println("---\n MacOSMenuSetup 已加载 \n---");

    }
}
