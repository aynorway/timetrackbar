package com.aynor.menu.menusetup;

import javax.swing.JFrame;

// 菜单设置接口
// 这是一个接口文件，定义了菜单设置的方法，供不同的操作系统实现使用。
public interface MenuSetup {
    void setupMenu(JFrame mainFrame);
}
