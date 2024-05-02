// TaskManager 
// 根据增加任务/减少任务, 调整BasicFrame的尺寸以适应任务行的尺寸增减。
// 根据增加/删减的frame, 也删除相应的frame中的BasicPanel实例（任务行）。
package com.aynor.ui.taskmanager;

import com.aynor.ui.basicframe.BasicFrame;
import com.aynor.ui.basicpanel.BasicPanel;

public class TaskManager {
    private BasicFrame myMainFrame;
    private BasicPanel myTaskPanel;

    public TaskManager(BasicFrame aMainFrame, BasicPanel aTaskPanel) {
        this.myMainFrame = aMainFrame;
        this.myTaskPanel = aTaskPanel;
    }

    public void addTask(boolean isFirst) {
        myMainFrame.setSize(900, myMainFrame.getHeight() + 45);
        BasicPanel newTask = new BasicPanel();
        myTaskPanel.add(newTask);

        myMainFrame.revalidate();
        myMainFrame.repaint();
    }

    public void removeTask(BasicPanel task) {
        myMainFrame.setSize(900, myMainFrame.getHeight() - 45);
        myTaskPanel.remove(task);

        myMainFrame.revalidate();
        myMainFrame.repaint();
    }
}
