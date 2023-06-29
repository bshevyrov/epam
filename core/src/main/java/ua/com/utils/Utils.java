package ua.com.utils;

import ua.com.company.StringUtils;

import java.util.Arrays;

public final class Utils {
    private Utils() {
    }

    public static boolean isAllPositiveNumbers(String... str) {
        return Arrays.stream(str).allMatch(StringUtils::isPositiveNumber);
    }
}
