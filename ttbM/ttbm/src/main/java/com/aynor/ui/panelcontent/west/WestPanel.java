// WestPanel.java 包括按键部分(调用addNewTimerTask 和removeTimerTask) 和文字框部分 
package com.aynor.ui.panelcontent.west;

// import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

// import com.aynor.ui.timertaskmanager.TimerTaskListener; 
// import com.aynor.ui.timertaskmanager.TimerTaskManager; 
// import com.aynor.ui.mainframe.MainFrame; 

public class WestPanel extends JPanel {
    private JButton controlButton;

    public WestPanel () {
        setLayout(new FlowLayout());

        controlButton = new JButton("Add Task");

        add(controlButton);
    }
}

