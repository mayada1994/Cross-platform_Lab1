package listeners;

import button.BasicButtonImpl;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

public class CustomMouseListener extends MouseAdapter {

    private final JPanel panel;
    private final List<BasicButtonImpl> buttons;

    public CustomMouseListener(JPanel panel, List<BasicButtonImpl> buttons) {
        this.panel = panel;
        this.buttons = buttons;
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        super.mouseReleased(e);
        for (BasicButtonImpl button : buttons) {
            button.setClicked(false);
        }
        panel.repaint();
    }

    @Override
    public void mousePressed(MouseEvent e) {
        super.mouseClicked(e);
        for (BasicButtonImpl button : buttons) {
            if (button.onButton(e.getX(), e.getY())) {
                button.setClicked(true);
            }
            panel.repaint();
        }
    }
}
