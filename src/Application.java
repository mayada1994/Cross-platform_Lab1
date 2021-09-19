import panel.MainPanel;
import panel.MainWindow;

public class Application {

    public static void main(String[] args) {
        MainWindow window = new MainWindow(new MainPanel());
        window.show();
    }
}
