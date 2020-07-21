package com.stayready.as03.problem03;

public class Problem03 {
    public String isPalindrome(String input){
        String string = "";
        String reverseString = new StringBuilder(input).reverse().toString();
        if (input.equals(reverseString)){
            string = "YES";
        }else{
            string = "NO";
        }
        return string;
    }
}
