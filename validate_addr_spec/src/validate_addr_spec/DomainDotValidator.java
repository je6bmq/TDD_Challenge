package validate_addr_spec;

public class DomainDotValidator {
    public static boolean isValidD1(String domain) {
        return true;
    }
    public static boolean isValidD2(String domain) {
        return true;
    }
    public static boolean isValidD3(String domain) {
        return domain.lastIndexOf(".") != domain.length() - 1;
    }
    public static boolean isValidD4(String domain) {
        return domain.indexOf("..") == -1;
    }
    public static boolean isValidD5(String domain) {
        return domain.length() >= 1;
    }
}
