// 管理是否事增加任务还是减少一个任务, 相对应的更改frame的操作 
package com.aynor.ui.timertaskmanager;
import com.aynor.ui.mainframe.MainFrame;
import com.aynor.ui.panelcontent.TimerTaskPanel;

import javax.swing.JPanel;


public class TimerTaskManager implements TimerTaskListener {
    private MainFrame wdMainFrame;
    private JPanel wdTaskPanel;

    public TimerTaskManager(MainFrame mainFrame, JPanel taskPanel) {
        this.wdMainFrame = mainFrame;
        this.wdTaskPanel = taskPanel;
    }

    // 要确保 MainFrame.java 继承 extends JFrame 
    @Override
    public void addNewTimerTask(boolean isFirst) {
        TimerTaskPanel timerTask = new TimerTaskPanel();
        wdTaskPanel.add(timerTask);
        wdMainFrame.setSize(900, wdMainFrame.getHeight() + 45);
        wdMainFrame.revalidate();
        wdMainFrame.repaint();
    }

    @Override
    public void removeTimerTask(TimerTaskPanel timerTask) {
        wdTaskPanel.remove(timerTask);
        wdMainFrame.setSize(900, wdMainFrame.getHeight() - 45);
        wdMainFrame.revalidate();
        wdMainFrame.repaint();
    }
}
