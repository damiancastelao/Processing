import processing.core.PApplet;

public class Formas extends PApplet {

    int viewport_w = 640;
    int viewport_h = 360;

    public static void main(String args[]) {
        PApplet.main("Formas");
    }

    @Override
    public void settings() {
        size(viewport_w, viewport_h, P2D);
        smooth(8);
    }

    @Override
    public void setup() {
    }

    @Override
    public void draw() {
        background(255);
    }
}