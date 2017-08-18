package validate_addr_spec;

import java.util.regex.Pattern;

public class DomainDotValidator {
    public static boolean isValidD1(String domain) {
        Pattern pattern =Pattern.compile("(\\w|!|#|\\$|%|&|'|\\*|\\+|\\-|\\/|=|\\?|\\^|_|`|\\{|\\||\\}|~|\\.)+");
        return pattern.matcher(domain).matches();
    }
    public static boolean isValidD2(String domain) {
        return domain.charAt(0) != '.';
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
