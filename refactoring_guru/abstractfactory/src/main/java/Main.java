import app.Application;
import factories.GUIFactory;
import factories.MacOSFactory;
import factories.WindowsFactory;

public class Main {
    public static void main(String[] args) {
        
        Application app;

        GUIFactory factory;

          String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("windows")) {
            factory = new MacOSFactory();
        } else {
            factory = new WindowsFactory();
        }

        app = new Application(factory);
        app.paint();
    }
}