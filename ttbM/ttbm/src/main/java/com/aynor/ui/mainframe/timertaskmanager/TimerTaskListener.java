// 这个TimerTaskListener.java 接口连接 TimerTaskManager.java 
package com.aynor.ui.mainframe.timertaskmanager;

import com.aynor.ui.mainpanel.BaseMainPanel;

public interface TimerTaskListener {
    void addNewTimerTask(boolean isFirst);

    void removeTimerTask(BaseMainPanel timerTask);
}
