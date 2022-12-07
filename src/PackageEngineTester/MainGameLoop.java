package PackageEngineTester;

import org.lwjgl.opengl.Display;
import renderEngine.DisplayManager;

public class MainGameLoop {
    public static void main(String[] agrs){
        DisplayManager.createDisplay();

        while (!Display.isCloseRequested()){
            // Game logic
            // Rendering
            DisplayManager.updateDisplay();
        }

        DisplayManager.closeDisplay();
    }
}
