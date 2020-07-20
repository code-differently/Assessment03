package com.stayready.as03.problem03;

import java.util.Arrays;

public class Problem03 {
    public String isPalindrome(String input){
        char[] newCharacterArray = input.toCharArray();
        Arrays.sort(newCharacterArray);
        for(int i = 0; i < newCharacterArray.length-1; i++){
            if(newCharacterArray[i] == newCharacterArray[i+1]){
                return "YES";
            }
        }

        return "NO";
    }
}
