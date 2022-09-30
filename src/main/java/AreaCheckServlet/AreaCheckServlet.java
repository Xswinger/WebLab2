package AreaCheckServlet;

import ControllerServet.Area;

import javax.servlet.http.HttpServlet;

import static java.lang.Math.abs;
import static java.lang.Math.pow;

public class AreaCheckServlet extends HttpServlet {
    private int x;
    private float y;
    private float r;

    public AreaCheckServlet(Area area) {
        this.x = area.getX();
        this.y = area.getY();
        this.r = area.getR();
    }

    public AreaCheckServlet() {
    }

    public boolean checkSecondQuarterHit() {
        return (r / 2) <= x && x <= 0 && r >= y && y >= 0;
    }

    public boolean checkThirdQuarterHit() {
        return (x <= 0 && y <= 0) && (pow(x, 2) + pow(y, 2) < r);
    }

    public boolean checkFourthQuarterHit() {
        return x >= 0 && y <= 0 && abs(x) * abs(y) <= r && x <= -r;
    }
}
