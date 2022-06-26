import processing.core.PApplet;

public class TryProcessing extends PApplet {
    private static Window window = new Window(1200,1000,0);
    public static final int POSITION_Y = window.getWindowHeight() / 5;
    int position_x = window.getWindowIntialPos();
    public static Ball ball = new Ball(20);


    public static void main(String[] args) {
       PApplet.main("TryProcessing",args);
    }

    @Override
    public void settings() {
        size(window.getWindowWidth(), window.getWindowHeight());
    }

    @Override
    public void draw() {
        for (int speed = 1; speed <=4; speed++) {
            ellipse(position_x *speed, POSITION_Y *speed,ball.getBallDia(),ball.getBallDia());
        }
        position_x++;
    }
}


