package com.stayready.as03.problem03;

public class Problem03 {
    public String isPalindrome(String input){
        int[] alphabet = new int[26];
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            alphabet[input.charAt(i) - 'a']++;
        }
        for (int num : alphabet) {
            if (num % 2 != 0) {
                count++;
            }
            if (count > 1) {
                return "NO";
            }

        }
        return "YES";
    }
}
