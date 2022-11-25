package dto;

import static java.lang.Math.pow;

public class HitChecker {
    private static HitChecker instance = null;

    public static HitChecker getInstance() {
        if (instance == null) {
            instance = new HitChecker();
        }
        return instance;
    }

    public boolean checkValues(Area area) {
        return checkFirstQuarterHit(area) || checkSecondQuarterHit(area) || checkThirdQuarterHit(area);
    }

    private static boolean checkFirstQuarterHit(Area area) {
        return (area.getY() <= ((area.getR()/2) - area.getX()) && area.getX() >= 0 && area.getY() >= 0);
    }
    private static boolean checkSecondQuarterHit(Area area) {
        return (-(area.getR()) <= area.getX() && area.getX() <= 0 && area.getY() >= 0 && area.getY() <= (area.getR()/2));
    }

    private static boolean checkThirdQuarterHit(Area area) {
        return (area.getX() <= 0 && area.getY() <= 0 && (pow(area.getX(), 2) + pow(area.getY(), 2) <= area.getR()));
    }
}
