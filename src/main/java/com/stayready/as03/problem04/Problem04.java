package com.stayready.as03.problem04;

import java.util.HashMap;

public class Problem04 {
    public Boolean harmlessRansomNote(String message , String magazineText){

        HashMap<String, Integer> neededWords = new HashMap<>();
        HashMap<String, Integer> allWords = new HashMap<>();

        String[] note = message.split(" ");
        String[] magazine = magazineText.split(" ");

        for (String word : note) {
            if (!neededWords.containsKey(word)) {
                neededWords.put(word, 1);
            } else {
                neededWords.replace(word, neededWords.get(word) + 1);
            }
        }

        for (String word : magazine) {
            if (!allWords.containsKey(word)) {
                allWords.put(word, 1);
            } else {
                allWords.replace(word, allWords.get(word) + 1);
            }
        }

        for (String word: neededWords.keySet()){
            if(neededWords.get(word) > allWords.get(word)){
                return false;
            }
        }
        return true;
    }

}

