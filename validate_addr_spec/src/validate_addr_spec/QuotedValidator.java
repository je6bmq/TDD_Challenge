package validate_addr_spec;

public class QuotedValidator {
    public static boolean isValidLQ1(String quoted) {
        return quoted.charAt(0) == '\"';
    }
    public static boolean isValidLQ2(String quoted) {
        return true;
    }
    public static boolean isValidLQ3(String quoted) {
        return true;
    }
    public static boolean isValidLQ4(String quoted) {
        return true;
    }
    public static boolean isValidLQ5(String quoted) {
        return quoted.length() >= 2;
    }
}
