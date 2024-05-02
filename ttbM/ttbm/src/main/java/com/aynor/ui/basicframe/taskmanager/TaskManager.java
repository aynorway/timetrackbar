// TaskManager（位于basicframe/taskmanager目录）
// 调整BasicFrame的尺寸以适应任务行的增减。
// 负责管理所有的BasicPanel实例（任务行），包括添加和删除操作。
package com.aynor.ui.basicframe.taskmanager;

import com.aynor.ui.basicframe.BasicFrame;
import com.aynor.ui.basicpanel.BasicPanel;

import javax.swing.JPanel;

public class TaskManager {
    private BasicFrame mainFrame;
    private JPanel taskPanel;

    public TaskManager(BasicFrame aMainFrame, JPanel taskPanel) {
        this.mainFrame = aMainFrame;
        this.taskPanel = taskPanel;
    }

    // 要确保 MainFrame.java 继承 extends JFrame
    public void addNewTimerTask(boolean isFirst) {
        BasicPanel timerTask = new BasicPanel();
        taskPanel.add(timerTask);
        mainFrame.setSize(900, mainFrame.getHeight() + 45);
        mainFrame.revalidate();
        mainFrame.repaint();
    }

    public void removeTimerTask(BasicPanel timerTask) {
        taskPanel.remove(timerTask);
        mainFrame.setSize(900, mainFrame.getHeight() - 45);
        mainFrame.revalidate();
        mainFrame.repaint();
    }
}
