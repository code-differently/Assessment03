package com.stayready.as03.problem03;

public class Problem03 {

    public String isPalindrome(String input){
        int words = 0;
        int  comparingWords = input.length() - 1;

        while (words < comparingWords) {  // compare i and j
            if (input.charAt(words) == input.charAt(comparingWords)) // If match
                return "YES";
            comparingWords--;
        }
        return "NO";
    }
}

