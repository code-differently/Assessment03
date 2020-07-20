package com.stayready.as03.problem03;

import java.util.Arrays;

public class Problem03 {
    public String isPalindrome(String input){
        char tempArray[] = input.toCharArray();
        Arrays.sort(tempArray);
        if (tempArray[0] == tempArray[1]){
            return "YES";
        }
        return "NO";
    }
}
