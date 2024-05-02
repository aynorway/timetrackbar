// BasicPanel.java 
// * 表示单个任务的面板。
// * 整合和包括 所有 东、南、西、北、中, 5个panels 文件. 
// * 注: 5个panels文件中, 包含任务相关的控件和操作逻辑，例如开始、停止计时等。
package com.aynor.ui.basicpanel;

import java.awt.BorderLayout;

// import javax.swing.JButton;
import javax.swing.JPanel;

import com.aynor.ui.basicpanel.panelcontent.center.CenterPanel;
import com.aynor.ui.basicpanel.panelcontent.east.EastPanel;
import com.aynor.ui.basicpanel.panelcontent.west.WestPanel;

public class BasicPanel extends JPanel {
    // private NorthPanel northPanel;
    // private SouthPanel southPanel;
    private EastPanel eastPanel;
    private WestPanel westPanel;
    private CenterPanel centerPanel;

    public BasicPanel() {
        this.setLayout(new BorderLayout());
        // northPanel = new NorthPanel();
        // southPanel = new SouthPanel();
        eastPanel = new EastPanel();
        westPanel = new WestPanel();
        centerPanel = new CenterPanel();

        // this.add(northPanel, BorderLayout.NORTH);
        // this.add(southPanel, BorderLayout.SOUTH);
        this.add(eastPanel, BorderLayout.EAST);
        this.add(westPanel, BorderLayout.WEST);
        this.add(centerPanel, BorderLayout.CENTER);
    }

    // 可以添加更多的方法来对子面板进行操作或更新
}
