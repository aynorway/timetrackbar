package com.aynor.ui;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.BorderLayout;

// 主窗体类 
public class MainFrame {
    private JFrame mainFrame;
    private JPanel taskPanel;

    public MainFrame() {
        setupMainFrame();
        setupTaskPanel();
        // setupMenu();
    }

    private void setupMainFrame() {
        mainFrame = new JFrame("TimeTrackBar Application");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(900, 70); // 设置窗口大小
        mainFrame.setLocationRelativeTo(null); // 居中显示
    }

    private void setupTaskPanel() {
        taskPanel = new JPanel();
        taskPanel.setLayout(new BoxLayout(taskPanel, BoxLayout.Y_AXIS));
        mainFrame.add(taskPanel, BorderLayout.PAGE_START);
    }

    // private void setupMenu() {
    //     MenuSetup menuSetup = System.getProperty("os.name").toLowerCase().contains("mac") ?
    //                           new MacOSMenuSetup() : new WindowsMenuSetup();
    //     menuSetup.setupMenu(mainFrame);
    // }

    public void show() {
        mainFrame.setVisible(true);
    }
}
