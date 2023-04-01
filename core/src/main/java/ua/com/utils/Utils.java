package ua.com.utils;

import ua.com.company.StringUtils;

public final class Utils {
    private Utils() {}

    public static boolean isAllPositiveNumbers(String... str){
        if(str.length>0) {
            for (String s : str) {
                if (StringUtils.isPositiveNumber(s)) {
                    return true;
                }
            }
        }
        return false;
    }
}
