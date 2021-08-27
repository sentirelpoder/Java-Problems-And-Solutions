package com.setenay.javaproblemsandsolutions.strings;

import org.springframework.util.StringUtils;

public class ReverseString {

    private ReverseString() {
        throw new IllegalStateException("Utility class");
    }

    //O(n)
    public static String reverseOne(String str) {
        if (!StringUtils.hasLength(str) || str.length() < 2) return str;
        char[] strArr = str.toCharArray();
        char temp;
        int i = 0;
        int j = strArr.length - 1;
        while (i < j) {
            temp = strArr[i];
            strArr[i++] = strArr[j];
            strArr[j--] = temp;
        }
        return String.valueOf(strArr);
    }

    //O(n)
    public static String reverseTwo(String str) {
        if (!StringUtils.hasLength(str) || str.length() < 2) return str;
        char[] strArr = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            strArr[i] = str.charAt((str.length() - 1) - i);
        }
        return String.valueOf(strArr);
    }

    //O(n)
    public static String reverseThree(String str) {
        if (!StringUtils.hasLength(str) || str.length() < 2) return str;
        StringBuilder stringBuilder = new StringBuilder(str);
        return stringBuilder.reverse().toString();
    }
}
