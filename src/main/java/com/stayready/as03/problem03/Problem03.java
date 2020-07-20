package com.stayready.as03.problem03;

public class Problem03 {
    public String isPalindrome(String input) {
        for (int i = 0; i < input.length(); i++) {
            for (int j = i + 2; j <= input.length(); j++) {
                String value = input.substring(i, j);
                String rev = new StringBuilder(value).reverse().toString();
                if (value.equals(rev)) {
                    return "YES";
                }
            }
        }
        return "NO";
    }
}
