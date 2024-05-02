// WestPanel.java 
// 包含控制任务增加和减少的按钮。
// 按钮可触发TaskManager中增加或删除BasicPanel的方法。
package com.aynor.ui.basicpanel.panelcontent.west;

// import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

// import com.aynor.ui.taskmanager.TaskManager;

public class WestPanel extends JPanel {
    private JButton addButton;
    private JButton removeButton;

    public WestPanel() {
        // 设置面板布局为流布局
        setLayout(new FlowLayout());

        // 创建并添加“Add Task”按钮
        addButton = new JButton("Add Task");
        add(addButton);

        // 创建并添加“Remove Task”按钮
        removeButton = new JButton("Remove Task");
        add(removeButton);

        // 为按钮添加事件监听器 (需要实现逻辑，例如连接到TimerTaskManager)
        addButton.addActionListener(e -> {
            System.out.println("Adding new timer task...");
            // 调用添加任务的方法，例如: TimerTaskManager.addNewTimerTask();
        });

        removeButton.addActionListener(e -> {
            System.out.println("Removing timer task...");
            // 调用移除任务的方法，例如: TimerTaskManager.removeTimerTask();
        });
    }
}
