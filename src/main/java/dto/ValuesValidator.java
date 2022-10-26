package dto;

import java.util.Arrays;
import java.util.regex.Pattern;

public class ValuesValidator {

    private static final Pattern checkOnNumber = Pattern.compile("-?\\d+(\\.\\d+)?");

    public static boolean validInputValues(String x, String y, String r) {
        return (validateX(x) && validateY(y) && validateR(r));
    }

    private static boolean validateX(String x) {
        return x != null && Arrays.asList("-2", "-1.5", "-1", "-0.5", "0", "0.5", "1", "1.5", "2").contains(x);
    }

    private static boolean validateY(String y) {
        return checkOnNumber.matcher(y).matches() && (Float.parseFloat(y) >= -3 && Float.parseFloat(y) <= 3);
    }

    private static boolean validateR(String r) {
        return r != null && Arrays.asList("1", "1.5", "2", "2.5", "3").contains(r);
    }
}
