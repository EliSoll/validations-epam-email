package com.epam.rd.autotasks.validations;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EpamEmailValidation {
    public static final String EMAIL_EPAM_PATTERN = "^[a-zA-Z]+_[A-Za-z0-9_-]+@epam\\.com$";


    private static final Pattern pattern = Pattern.compile(EMAIL_EPAM_PATTERN);

    public static boolean validateEpamEmail(String email) {
        if (email != null && !email.isEmpty() && !email.equals(" ")) {
            Matcher matcher = pattern.matcher(email);
            return matcher.matches();
        }

        return false;
    }
}





