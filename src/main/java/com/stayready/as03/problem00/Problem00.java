package com.stayready.as03.problem00;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Problem00 {
    public String countUniqueWords(String input){
        String countedWords = "";
        List<String> list = Arrays.asList(input.split(""));
        Set<String> uniqueWords = new HashSet<String>(list);
        for (String word: uniqueWords){
           countedWords = word + "(Seen "+Collections.frequency(list, word) +")";
        }
        return countedWords;
    }
}
