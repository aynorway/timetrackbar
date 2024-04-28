// UI模块
package com.aynor.ui;

// import javax.swing.plaf.FontUIResource;

public class UIManager {
    public static void setupUI() {
        // 设置用户界面的逻辑
        System.out.println("Setting up UI...\n——————————————");
        // 可能还包括初始化窗口、布局、控件等

        // 设置全局字体
        // UIManagerHelper.setDefaultUIFont(new FontUIResource("Serif", Font.PLAIN, 12));

        // 创建并显示主窗体
        MainFrame mainFrame = new MainFrame();
        mainFrame.show(); // 确保调用此方法
    }

}
