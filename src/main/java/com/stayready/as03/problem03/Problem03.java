package com.stayready.as03.problem03;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class Problem03 {
    HashMap<Character, Integer> numTimes = new HashMap<>();
    public String isPalindrome(String input){


        for(char letter: input.toCharArray()) {
                numTimes.merge(letter, 1, Integer::sum);
        }

        return findNumberOfOddOccurrences() <= 1 ? "YES" : "NO";
    }

    private int findNumberOfOddOccurrences() {
        AtomicInteger countOdds = new AtomicInteger();
        numTimes.forEach((key, value) -> {
            if(value % 2 == 1) {
                countOdds.getAndIncrement();
            }
        });
        return countOdds.get();
    }
}
