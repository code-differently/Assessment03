package com.stayready.as03.problem03;

import java.util.HashSet;

public class Problem03 {
    public String isPalindrome(String input){
        HashSet<Character> palindrome = new HashSet<>();

        for(int i=0; i<input.length(); i++){
            if(!palindrome.add(input.charAt(i)))
                palindrome.remove(input.charAt(i));
        }

        if(palindrome.isEmpty() || palindrome.size() == 1)
            return "YES";
        else
            return "NO";
    }
}
