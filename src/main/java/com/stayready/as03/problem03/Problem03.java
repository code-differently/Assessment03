package com.stayready.as03.problem03;

import java.util.ArrayList;

public class Problem03 {
    public String isPalindrome(String input){
        ArrayList<Character> palindrome = new ArrayList<>();
        for(int i = 0; i < input.length(); i++) {
            if(palindrome.equals(input.charAt(i))) {
                palindrome.remove((Character)input.charAt(i));
            } else {
                palindrome.add(input.charAt(i));
            }
        }
        return null;
    }
}
