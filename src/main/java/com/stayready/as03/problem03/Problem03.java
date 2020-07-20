package com.stayready.as03.problem03;

import java.util.ArrayList;
import java.util.List;

public class Problem03 {
    public String isPalindrome(String input){
        String o = "YES";
        String p = "NO";
        List<Character> storage = new ArrayList<Character>(); 

        for(int i = 0; i < input.length(); i++){
            if(storage.contains(input.charAt(i))){
                storage.remove((Character) input.charAt(i));
            } else {
                storage.add(input.charAt(i));
            }
        }

        if((input.length() % 2 ==0 && storage.isEmpty()) || (input.length() % 2 == 1 && storage.size() ==1)){
            return o;
        } 
        return p;
    }
}
