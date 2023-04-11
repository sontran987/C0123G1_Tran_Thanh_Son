package bai_3.utils;

public class Validate {
    static final String REGEX_CODE = "^(MHD-)[0-9]{4}$";
    static final String REGEX_NAME_COSTOMER= "^[A-Z][a-z]*(\\s[A-Z][a-z]+)*$";

    public static boolean maHoaDon(String code) {
        return code.matches(REGEX_CODE);
    }

    public static boolean nameCustomer(String name) {
        return name.matches(REGEX_NAME_COSTOMER);
    }
}
