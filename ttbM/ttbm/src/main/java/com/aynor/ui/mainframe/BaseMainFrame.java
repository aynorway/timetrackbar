// APP 初始的 Basic MainFrame 及调用 panel 
package com.aynor.ui.mainframe;

// import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;

import com.aynor.menu.menusetup.MacOSMenuSetup;
import com.aynor.menu.menusetup.MenuSetup;
import com.aynor.menu.menusetup.WindowsMenuSetup;
import com.aynor.ui.mainpanel.BaseMainPanel;

// 主窗体类 
public class BaseMainFrame extends JFrame {
    private JPanel taskPanel;

    public BaseMainFrame() {
        super("TimeTrackBar Application"); // 正确的super调用. super 调用父类构造器只能在子类构造器的第一行使用。
        System.out.println("--- \n 设置 MainFrame UI...\n---");
        setupMainFrame();
        setupTaskPanel();
        setupMenu();
    }

    private void setupMainFrame() {
        System.out.println("--- \n 设置 MainFrame UI...\n---");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(900, 70); // 设置窗口大小
        setLocationRelativeTo(null); // 居中显示
    }

    private void setupTaskPanel() {
        System.out.println("--- \n 设置 setupTaskPanel UI...\n---");

        taskPanel = new BaseMainPanel(); // 使用 TimerTaskPanel
        add(taskPanel, BorderLayout.CENTER); // 使用this.add也是可以的，this通常被省略
    }

    // 调用 MenuSetup
    private void setupMenu() {
        System.out.println("--- \n 设置 setupMenu UI...\n---");

        MenuSetup menuSetup;
        String os = System.getProperty("os.name").toLowerCase();
        if (os.contains("mac")) {
            menuSetup = new MacOSMenuSetup();
        } else if (os.contains("win")) {
            menuSetup = new WindowsMenuSetup();
        } else {
            // 对于其他未知操作系统，可能不提供特定的菜单设置
            menuSetup = frame -> {
            };
        }
        menuSetup.setupMenu(this); // 应该传递 this，因为 this 代表的是 MainFrame 实例，也就是一个 JFrame
    }

    public void showFrame() {
        setVisible(true); // 调用 JFrame 的 setVisible 方法
    }
}
