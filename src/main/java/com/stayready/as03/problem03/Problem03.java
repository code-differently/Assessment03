package com.stayready.as03.problem03;

public class Problem03 {
    public String isPalindrome(String input){
        
        for(int i = 0; i < input.length() - 1; i++){
            if(input.charAt(i) == input.charAt(i+1)){
                return "YES";
            }
        }

        return "NO";
    }
}
