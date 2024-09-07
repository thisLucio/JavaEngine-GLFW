package stely;

import org.lwjgl.Version;
import org.lwjgl.glfw.GLFWErrorCallback;

import static org.lwjgl.glfw.GLFW.*;

public class Window {
        int width, height;
        String title;

        private static Window window = null;

        private Window(){
            this.width = 1920;
            this.height = 1080;
            this.title = "Aquele atrás do armário";
        }

    public static Window get() {
        if(Window.window == null){
            Window.window = new Window();
        }

        return Window.window;
    }

    private void run(){
        System.out.println("Hello LWGL " + Version.getVersion() + "!");

        init();
        loop();
    }

    public void init(){
        //Setup an error callback
        GLFWErrorCallback.createPrint(System.err).set();

        //Initialize GLFW
        if(!glfwInit()){
            throw new IllegalStateException("Unable to initialize GLFW");
        }

        //Configure GLFW
        glfwDefaultWindowHints();
        glfwWindowHint(GLFW_VISIBLE, GLFW_FALSE);
        glfwWindowHint(GLFW_RESIZABLE, GLFW_TRUE);
        glfwWindowHint(GLFW_MAXIMIZED, GLFW_TRUE);


    }

    public void loop(){

    }
}
