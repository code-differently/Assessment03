package com.stayready.as03.problem03;

import java.util.HashSet;
import java.util.concurrent.atomic.AtomicInteger;

public class Problem03 {
    public String isPalindrome(String input) {
        int occurrenceThreshold = 1;
        return numberOfLettersAppearingAnOddNumberOfTimes(input) <= occurrenceThreshold ? "YES" : "NO";
    }

    private int numberOfLettersAppearingAnOddNumberOfTimes(String input) {
        HashSet<Character> lettersOccurringAnOddNumberOfTimes = new HashSet<>();
        for(char letter: input.toCharArray()) {
            if(lettersOccurringAnOddNumberOfTimes.contains(letter)) {
                lettersOccurringAnOddNumberOfTimes.remove(letter);
            }
            else {
                lettersOccurringAnOddNumberOfTimes.add(letter);
            }
        }
        return lettersOccurringAnOddNumberOfTimes.size();
    }
}
