package GUI例子;
import javax.swing.*;
import java.awt.*;

public class GlueExample {
    public static void main(String[] args) {
        // 创建一个新的窗体
        JFrame frame = new JFrame("Vertical Glue Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);

        // 创建一个面板，并设置其布局管理器为垂直的BoxLayout
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        // 创建三个按钮
        JButton topButton = new JButton("Top");
        JButton middleButton = new JButton("Middle");
        JButton bottomButton = new JButton("Bottom");

        // 在面板中添加组件，其中包含垂直胶水
        panel.add(Box.createVerticalGlue()); // 添加胶水推动后续组件向下
        panel.add(topButton);
        panel.add(Box.createVerticalGlue()); // 在两个按钮之间添加胶水
        panel.add(middleButton);
        panel.add(Box.createVerticalGlue()); // 在两个按钮之间添加胶水
        panel.add(bottomButton);
        panel.add(Box.createVerticalGlue()); // 添加胶水推动前面的组件向上

        // 将面板添加到窗体中
        frame.add(panel);
        frame.setVisible(true);
    }
}
