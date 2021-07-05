package com.stayready.as03.problem03;

import java.util.HashSet;

public class Problem03 {
    public String isPalindrome(String input){
        String isPal="YES";

        StringBuilder builder=new StringBuilder();
        String word=builder.append(input).reverse().toString();
        if(word.equalsIgnoreCase(input))
            return isPal;
        else{
            HashSet<String> words = new HashSet<String>();
            String[] split=input.split("");

            for (int i = 0; i <split.length; i++) {
                if(!words.add(split[i]))
                    words.remove(split[i]);
            }

            if(words.size()>1)
                isPal="NO";
        }
        return isPal;
    }
}
