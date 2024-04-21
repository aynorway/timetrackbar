import javax.swing.*;
import java.awt.*;

public class FlowLayoutExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("FlowLayout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 100);

        JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER)); // 设置为居中对齐

        JButton topButton = new JButton("Top");
        JButton middleButton = new JButton("Middle");
        JButton bottomButton = new JButton("Bottom");

        panel.add(topButton);
        panel.add(middleButton);
        panel.add(bottomButton);

        frame.add(panel);
        frame.setVisible(true);
    }
}
