package case_study_module02.services;

public class Validate {
    static final String REGEX_NAME = "^([A-Z][a-z]*)(\\s[A-Z][a-z]+)*$";
    static final String REGEX_BRITHDAY = "^(0[1-9]|[12][0-9]|3[01])(/)(0[1-9]|1[012])(/)((19((2[4-9])|([3-9][0-9])))|200[0-5])$";
    static final String REGEX_EMAIL = "^(\\w)+(@)[a-z]+\\.[a-z]+$";
    static final String REGEX_PHONE = "^[0-9]{10}$";
    static final String REGEX_DATE = "^(0[1-9]|[12][0-9]|3[01])(/)(0[1-9]|1[012])(/)([2-9][0-9]{3})$";

    public static boolean regexName(String name) {
        return name.matches(REGEX_NAME);
    }

    public static boolean regexBrithday(String brithday) {
        return brithday.matches(REGEX_BRITHDAY);
    }

    public static boolean regexEmail(String email) {
        return email.matches(REGEX_EMAIL);
    }

    public static boolean regexPhone(String phone) {
        return phone.matches(REGEX_PHONE);
    }
    public static boolean regexDate(String date){
        return date.matches(REGEX_DATE);
    }
}
