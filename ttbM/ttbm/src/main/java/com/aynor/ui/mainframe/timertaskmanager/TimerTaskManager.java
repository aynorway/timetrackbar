// TimerTaskManager.java 管理是否事增加任务还是减少一个任务, 相对应的增加活加少frame的size  
package com.aynor.ui.mainframe.timertaskmanager;

import com.aynor.ui.mainframe.BaseMainFrame;
import com.aynor.ui.mainpanel.BaseMainPanel;

import javax.swing.JPanel;

public class TimerTaskManager implements TimerTaskListener {
    private BaseMainFrame mainFrame;
    private JPanel taskPanel;

    public TimerTaskManager(BaseMainFrame aMainFrame, JPanel taskPanel) {
        this.mainFrame = aMainFrame;
        this.taskPanel = taskPanel;
    }

    // 要确保 MainFrame.java 继承 extends JFrame
    @Override
    public void addNewTimerTask(boolean isFirst) {
        BaseMainPanel timerTask = new BaseMainPanel();
        taskPanel.add(timerTask);
        mainFrame.setSize(900, mainFrame.getHeight() + 45);
        mainFrame.revalidate();
        mainFrame.repaint();
    }

    @Override
    public void removeTimerTask(BaseMainPanel timerTask) {
        taskPanel.remove(timerTask);
        mainFrame.setSize(900, mainFrame.getHeight() - 45);
        mainFrame.revalidate();
        mainFrame.repaint();
    }
}
