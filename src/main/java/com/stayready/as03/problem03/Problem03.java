package com.stayready.as03.problem03;

import java.util.HashMap;

public class Problem03 {
    public String isPalindrome(String input){
        int count = 0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for(int i = 0; i < input.length(); i++) {
            if(map.get(input.charAt(i)) == null){
                map.put(input.charAt(i), 1);
            }
            else{
                int total=map.get(input.charAt(i))+1;
                map.replace(input.charAt(i),total);
            }
        }
        for (Character charact: map.keySet()) {
            int total = map.get(charact);
            if(total % 2 != 0){
                count++;
            }
        }
        if(count > 1){
            return "NO";
        }
        else{
            return "YES";
        }
    }
}
