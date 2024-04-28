package com.aynor.menu;

import javax.swing.JFrame;

// 菜单设置接口
// 这个接口定义了一个 setupMenu 方法，任何实现这个接口的类都需要提供具体的菜单设置逻辑。
public interface MenuSetup {
    void setupMenu(JFrame mainFrame);
}
