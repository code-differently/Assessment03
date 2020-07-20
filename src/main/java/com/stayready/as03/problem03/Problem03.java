package com.stayready.as03.problem03;

public class Problem03 {
    public String isPalindrome(String input){
        int val1 = 0, val2 = input.length() - 1; 
        while (val1 < val2) {  // compare i and j 
            if (input.charAt(val1) == input.charAt(val2)) // If match 
                return "YES"; 
            val2--;       
        } 
     
        return "NO"; //not a palindrome
    } 
    }

