package dto;

import java.io.Serializable;

public class Area implements Serializable {
    private Float x;
    private Float y;
    private Float r;
    private static Area instance = null;

    public static Area getInstance() {
        if (instance == null) {
            instance = new Area();
        }
        return instance;
    }

    public Area() {
    }

    public void setValues(Float x, Float y, Float r) {
        setX(x);
        setY(y);
        setR(r);
    }

    public void setX(Float x) {
        this.x = x;
    }

    public void setY(Float y) {
        this.y = y;
    }

    public void setR(Float r) {
        this.r = r;
    }

    public Float getX() {
        return x;
    }

    public Float getY() {
        return y;
    }

    public Float getR() {
        return r;
    }
}
