package com.stayready.as03.problem03;

import java.util.HashMap;

public class Problem03 {
    public String isPalindrome(String input){

        HashMap<Character, Integer> hm = new HashMap<>();
        int count = 0;

        for (int i = 0; i < input.length(); i++) {
            hm.put(input.charAt(i), hm.getOrDefault(input.charAt(i), 0) + 1);
        }

        for (int i = 0; i < input.length(); i++) {
            if (hm.containsKey(input.charAt(i)) && hm.get(input.charAt(i)) % 2 == 1) {
                count++;
                hm.remove(input.charAt(i));
            }
        }
        if (count == 1)
            return "YES";

        return "NO";
    }
}
