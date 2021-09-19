package button;

import java.awt.*;

public class BasicButtonImpl extends Button {

    public BasicButtonImpl(int x, int y, int width, int height) {
        super(x, y, width, height);
    }

    public void paintComponent(Graphics g, Color color) {
        super.paintComponent(new IGraphics() {
            @Override
            public void setColor() {
                if (isClicked) {
                    g.setColor(Color.RED);
                } else {
                    g.setColor(color);
                }
            }

            @Override
            public void fillRectangle(int x, int y, int width, int height) {
                g.fillRect(getX(), getY(), getWidth(), getHeight());
            }
        });
    }
}
