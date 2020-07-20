package com.stayready.as03.problem03;

import java.util.Arrays;

public class Problem03 {
    public String isPalindrome(String input){
        int oCount = 0;
        int eCount = 0;
        char [] letters = input.toCharArray();
        Arrays.sort(letters);
        for(int i = 0; i < input.length()-1; i++){
            if(letters[i] == letters[i+1]){
                eCount++;
                i++;
            }
            else{
                oCount++;
            }
        }
        if(oCount > 1){
            return "NO";
        }
        return "YES";
    }
}
