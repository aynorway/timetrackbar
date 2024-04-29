package com.aynor.ui.mainframe;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.BorderLayout;

import com.aynor.menu.menusetup.MacOSMenuSetup;
import com.aynor.menu.menusetup.MenuSetup;
import com.aynor.menu.menusetup.WindowsMenuSetup;

// 主窗体类 
public class MainFrame extends JFrame{
    private JFrame mainFrame;
    private JPanel taskPanel;

    public MainFrame() {
        System.out.println("--- \n 设置 MainFrame UI...\n---");
        setupMainFrame();
        setupTaskPanel();
        setupMenu();
    }

    private void setupMainFrame() {
        System.out.println("--- \n 设置 setupMainFrame UI...\n---");

        mainFrame = new JFrame("TimeTrackBar Application");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        mainFrame.setSize(900, 70); // 设置窗口大小
        mainFrame.setLocationRelativeTo(null); // 居中显示
    }

    private void setupTaskPanel() {
        System.out.println("--- \n 设置 setupTaskPanel UI...\n---");

        taskPanel = new JPanel();
        taskPanel.setLayout(new BoxLayout(taskPanel, BoxLayout.Y_AXIS));
        mainFrame.add(taskPanel, BorderLayout.PAGE_START);
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
            menuSetup = frame -> {}; 
        }
        menuSetup.setupMenu(mainFrame);
    }

    public void show() {
        mainFrame.setVisible(true);
    }


}
