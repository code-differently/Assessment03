package com.stayready.as03.problem04;

import java.util.HashMap;
import java.util.Map;

public class Problem04 {
    public Boolean harmlessRansomNote(String message, String magazineText) {

        Map<String, Integer> neededWords = new HashMap<>();
        Map<String, Integer> availableWords = new HashMap<>();

        String[] note = message.split(" ");
        String[] magazine = magazineText.split(" ");

        for (String word : note) {

            if (!neededWords.containsKey(word)) {// if this is a new word
                neededWords.put(word, 1);

            } else {

                neededWords.replace(word, neededWords.get(word) + 1); // increment value
            }

        }

        for (String word : magazine) {

            if (!availableWords.containsKey(word)) {// if this is a new word
                availableWords.put(word, 1);

            } else {

                availableWords.replace(word, availableWords.get(word) + 1); // increment value
            }

        }


        for (String word: neededWords.keySet()){
            if(neededWords.get(word) > availableWords.get(word)){
                return false;
            }
            
        }

        return true;
    }
}
