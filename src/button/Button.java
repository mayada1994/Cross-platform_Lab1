package button;

public abstract class Button {
    private final int x;
    private final int y;
    private final int width;
    private final int height;
    boolean isClicked = false;

    public Button(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean isClicked() {
        return isClicked;
    }

    public void setClicked(boolean clicked) {
        isClicked = clicked;
    }

    public void paintComponent(IGraphics g) {
        g.setColor();
        g.fillRectangle(x, y, width, height);
    }

    public boolean onButton(int x, int y) {
        return (this.x <= x && x <= (this.x + width))
                && (this.y <= y && y <= (this.y + height));
    }
}
