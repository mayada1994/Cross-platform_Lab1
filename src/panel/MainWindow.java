package panel;

import javax.swing.*;
import java.awt.*;

public class MainWindow {
    private JFrame frame;
    private final MainPanel panel;

    public MainWindow(MainPanel panel) {
        this.panel = panel;
        createFrame();
        initComponents();
    }

    private void initComponents() {
        frame.getContentPane().add(panel).setBackground(new Color(255, 241, 204));
    }

    private void createFrame() {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int width = (int) screenSize.getWidth();
        int height = (int) screenSize.getHeight();

        frame = new JFrame("Basic Button");
        frame.setSize(width, height);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public void show() {
        frame.setVisible(true);
    }
}
