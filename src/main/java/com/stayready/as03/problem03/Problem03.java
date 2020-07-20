package com.stayready.as03.problem03;

import java.util.HashMap;
import java.util.Map;

public class Problem03 {
    public String isPalindrome(String input){
        HashMap<Character, Integer> numTimes = new HashMap<>();

        for(char letter: input.toCharArray()) {
            if(numTimes.containsKey(letter)) {
                numTimes.put(letter, numTimes.get(letter) + 1);
            }
            else {
                numTimes.put(letter, 1);
            }
        }

        int countOdds = 0;
        for(Map.Entry<Character, Integer> element: numTimes.entrySet()) {
            if(element.getValue() % 2 == 1) {
                countOdds++;
            }
        }
        
        return countOdds > 1 ? "NO" : "YES";
    }
}
