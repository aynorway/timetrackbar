// 管理是否事增加任务还是减少一个任务, 相对应的更改frame的操作 
package com.aynor.ui.timertaskmanager;
import com.aynor.ui.mainframe.MainFrame;
import com.aynor.ui.panelcontent.TimerTaskPanel;

import javax.swing.JPanel;


public class TimerTaskManager implements TimerTaskListener {
    private MainFrame mainFrame;
    private JPanel taskPanel;

    public TimerTaskManager(MainFrame mainFrame, JPanel taskPanel) {
        this.mainFrame = mainFrame;
        this.taskPanel = taskPanel;
    }

    // 要确保 MainFrame.java 继承 extends JFrame 
    @Override
    public void addNewTimerTask(boolean isFirst) {
        TimerTaskPanel timerTask = new TimerTaskPanel();
        taskPanel.add(timerTask);
        mainFrame.setSize(900, mainFrame.getHeight() + 45);
        mainFrame.revalidate();
        mainFrame.repaint();
    }

    @Override
    public void removeTimerTask(TimerTaskPanel timerTask) {
        taskPanel.remove(timerTask);
        mainFrame.setSize(900, mainFrame.getHeight() - 45);
        mainFrame.revalidate();
        mainFrame.repaint();
    }
}
