package com.stayready.as03.problem00;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;

public class Problem00 {
    public String countUniqueWords(String input) {
        List<String> list = Arrays.asList(input.split(" "));
        Set<String> uniqueWords = new HashSet<String>(list);
        for (String word : uniqueWords) {
            System.out.println("The " + Collections.frequency(list, word) + " unique words are: ");
            System.out.println(word + " (seen " + Collections.frequency(list, word) + ")");
        }
        return input;
    }
}
