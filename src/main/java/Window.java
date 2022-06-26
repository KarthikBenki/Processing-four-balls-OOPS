public class Window {
//    public static final int WIDTH = 1000;
//    public static final int HEIGHT = 800;
//    public static final int INTIAL_X_POS = 0;

    private int windowWidth=1000;
    private int windowHeight=800;
    private int windowIntialPos=0;

    public Window(int windowWidth, int windowHeight, int windowIntialPos) {
        this.windowWidth = windowWidth;
        this.windowHeight = windowHeight;
        this.windowIntialPos = windowIntialPos;
    }

    public Window() {
    }

    public int getWindowWidth() {
        return windowWidth;
    }

    public int getWindowHeight() {
        return windowHeight;
    }

    public int getWindowIntialPos() {
        return windowIntialPos;
    }
}
