package ControllerServet;

public class Area {
    private int x;
    private float y;
    private float r;
    private static Area instance = null;

    public static Area getInstance() {
        if (instance == null) {
            instance = new Area();
        }
        return instance;
    }

    private Area() {
    }

    public Area(int x, float y, float r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setR(float r) {
        this.r = r;
    }

    public int getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public float getR() {
        return r;
    }
}
