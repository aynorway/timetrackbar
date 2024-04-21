import javax.swing.*;
import java.awt.*;

public class HorizontalBoxExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Horizontal Box Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 100);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));

        JButton topButton = new JButton("Top");
        JButton middleButton = new JButton("Middle");
        JButton bottomButton = new JButton("Bottom");

        panel.add(Box.createHorizontalGlue()); // 添加胶水，推动按钮向中间对齐
        panel.add(topButton);
        panel.add(middleButton);
        panel.add(bottomButton);
        panel.add(Box.createHorizontalGlue()); // 继续添加胶水，保持居中对齐

        frame.add(panel);
        frame.setVisible(true);
    }
}
