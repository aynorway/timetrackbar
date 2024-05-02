// BasicPanel.java 这里是一个面板类, 整合和包括所有 东南西北中 5个panels. 
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
