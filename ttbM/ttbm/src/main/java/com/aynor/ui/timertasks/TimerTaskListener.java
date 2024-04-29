package com.aynor.ui.timertasks;

import com.aynor.ui.panelcontent.TimerTaskPanel;

public interface TimerTaskListener {
    void addNewTimerTask(boolean isFirst);
    void removeTimerTask(TimerTaskPanel timerTask);
}
