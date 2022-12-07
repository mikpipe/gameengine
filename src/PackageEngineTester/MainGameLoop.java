package PackageEngineTester;

import org.lwjgl.opengl.Display;
import renderEngine.DisplayManager;
import renderEngine.Loader;
import renderEngine.RawModel;
import renderEngine.Renderer;

public class MainGameLoop {
    public static void main(String[] agrs){
        DisplayManager.createDisplay();

        Loader loader = new Loader();
        Renderer renderer = new Renderer();

        float[] vertices = {
                -0.5f, 0.5f, 0,
                -0.5f, -0.5f, 0,
                0.5f, -0.5f, 0,
                0.5f, -0.5f, 0,
                0.5f, -0.5f, 0,
                0.5f, 0.5f, 0,
                -0.5f, 0.5f, 0,

        };

        RawModel model = loader.loadToVAO(vertices);

        while (!Display.isCloseRequested()){
            renderer.prepare();

            renderer.render(model);
            DisplayManager.updateDisplay();
        }

        loader.CleanUp();
        DisplayManager.closeDisplay();
    }
}
