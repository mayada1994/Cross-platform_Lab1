package panel;

import button.BasicButtonImpl;
import listeners.CustomMouseListener;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class MainPanel extends JPanel {

    private final List<BasicButtonImpl> buttons = List.of(
            new BasicButtonImpl(30, 30, 300, 100),
            new BasicButtonImpl(400, 130, 700, 300),
            new BasicButtonImpl(30, 300, 50, 60));

    @Override
    public void paint(Graphics g) {
        this.addMouseListener(new CustomMouseListener(this, buttons));
        super.paint(g);
        for (BasicButtonImpl button : buttons) {
            button.paintComponent(g, Color.ORANGE);
        }
    }

}
