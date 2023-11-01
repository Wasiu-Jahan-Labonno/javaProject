import javax.swing.*;
import java.awt.*;

public class JframeOne extends JFrame {
    private JFrame frame;

    public JframeOne() {
        // initialize();
    }

    public void initialize() {
        frame = new JFrame();
        frame.setTitle("Baivab Chora");
        frame.setLayout(new BorderLayout(10, 5));
        frame.setSize(800, 500);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 5));

        panel.setBackground(Color.PINK);
        frame.add(panel, BorderLayout.CENTER);
        frame.setVisible(true);
    }

}
