package com.stayready.as03.problem03;

import java.util.HashMap;

public class Problem03 {
    public String isPalindrome(String input){
        HashMap<Character, Integer> occurrences = new HashMap<>();

        for(int i = 0; i < input.length(); i++) {
            char current = input.charAt(i);
            if (!occurrences.containsKey(current)) {
                occurrences.put(current, 1);
            } else {
                occurrences.replace(current, occurrences.get(current) + 1);
            }
        }

        int odds = 0;
        for(HashMap.Entry<Character, Integer> occur : occurrences.entrySet()) {
            if(occur.getValue() % 2 != 0 && odds > 0)
                return "NO";
            else if(occur.getValue() % 2 != 0)
                odds++;
        }

        return "YES";
    }
}
