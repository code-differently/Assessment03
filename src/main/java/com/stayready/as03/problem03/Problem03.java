package com.stayready.as03.problem03;

import com.stayready.as03.problem00.Problem00;

import java.util.HashMap;

public class Problem03 {

    private HashMap<Character, Integer> updateMap( HashMap<Character, Integer> map, Character input){

        if(!map.containsKey(input)) {

            map.put(input, 1);

        } else {
            map.put(input, map.get(input) + 1);
        }

        return map;
    }

    private String isPali(HashMap<Character, Integer> map) {

        int count = 0;
        for (Character key : map.keySet()) {
            Integer value = map.get(key);
            if(value % 2 != 0){
                count++;
                if (count > 1){
                    return "NO";
                }
            }
        }

        return "YES";
    }


    public String isPalindrome(String input){
        char [] arr = input.toCharArray();
        HashMap<Character, Integer> temp = new HashMap<Character, Integer>();
        for(int i = 0; i < arr.length; i++) {

            temp = updateMap(temp, arr[i]);
        }

        return isPali(temp);

    }
}
