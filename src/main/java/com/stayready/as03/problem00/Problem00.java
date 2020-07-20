package com.stayready.as03.problem00;

import java.util.*;

public class Problem00 {
    public String countUniqueWords(String input) {
        String empString = "";
        String newString[] = input.split(" ");
        HashMap<String, Integer> inputWords = new HashMap<>();
        for (String word : newString){
            if (inputWords.get(word) != null){
                inputWords.put(word, inputWords.get(word) + 1 );
            }
            else{
                inputWords.put(word, 1);
            }
        }
        Set<String> wordsInInput = inputWords.keySet();

        for (String word : wordsInInput){
            empString += word + " " + "(Seen " + inputWords.get(word) + ")\n";
        }

        return "The 3 unique words are: \n" + empString;
    }
}
