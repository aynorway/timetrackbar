// 这个接口连接 TimerTaskManager 
package com.aynor.ui.timertaskmanager;

import com.aynor.ui.panelcontent.TimerTaskPanel;

public interface TimerTaskListener {
    void addNewTimerTask(boolean isFirst);
    void removeTimerTask(TimerTaskPanel timerTask);
}
