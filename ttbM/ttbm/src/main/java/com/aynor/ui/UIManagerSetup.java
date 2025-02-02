// UI模块
package com.aynor.ui;

import javax.swing.plaf.FontUIResource;

import com.aynor.ui.basicframe.BasicFrame;

import java.awt.Font;

public class UIManagerSetup {
    public static void setupUI() {
        // 设置用户界面的逻辑
        System.out.println("——————————————\n UI 加载 UIManagerSetup ...\n---");
        // 可能还包括初始化窗口、布局、控件等

        // 设置全局字体
        FontUIResource f = new FontUIResource("Serif", Font.PLAIN, 12);
        UIFontManager.setDefaultUIFont(f);

        // 打印字体信息
        System.out.println("--- \n Font set to: \n " + f.getFontName() + ", Style: " + f.getStyle() + ", Size: "
                + f.getSize() + "\n---");

        // 创建并显示主窗体
        BasicFrame mainFrame = new BasicFrame();
        mainFrame.showFrame(); // 确保调用此方法
    }

}
