// 这个TimerTaskListener.java 接口连接 TimerTaskManager.java 
package com.aynor.ui.timertaskmanager;

import com.aynor.ui.panelcontent.TimerTaskPanel;

public interface TimerTaskListener {
    void addNewTimerTask(boolean isFirst);
    void removeTimerTask(TimerTaskPanel timerTask);
}
