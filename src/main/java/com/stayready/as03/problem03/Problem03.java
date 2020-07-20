package com.stayready.as03.problem03;

import java.util.HashSet;

public class Problem03 {
    public String isPalindrome(String input){
        int oddOneOutCount = 0;
        int isEvenAmount = 0;
        HashSet<Character> uniqueChars = new HashSet<Character>();
        for(char c: input.toCharArray()){
            if(uniqueChars.contains(c) == false){
                uniqueChars.add(c);
            }
        }
        for(char e : uniqueChars){
            for(char d : input.toCharArray()){
                if(e==d){
                    isEvenAmount++;
                }
            }
            if(isEvenAmount % 2 != 0){
                oddOneOutCount++;
            }
            isEvenAmount = 0;
        }
        if(oddOneOutCount > 1){
            return "NO";
        }
        return "YES";
    }
}
