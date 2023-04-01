package ua.com.utils;

import ua.com.company.StringUtils;

public final class Utils {
    private Utils() {}

    public static boolean isAllPositiveNumbers(String... str){
        if(str.length<1) {
            return false;
        }
        for (String s : str) {
            if(!StringUtils.isPositiveNumber(s)){
                return false;
            }
        }
        return true;
    }
}
