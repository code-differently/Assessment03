package com.stayready.as03.problem04;

import java.util.HashMap;
import java.util.Map;

public class Problem04 {
    public Boolean harmlessRansomNote(String message , String magazineText){
        HashMap<String, Integer> matchWordsToMagazine = new HashMap<>();

        String[] wordsOfMessage = message.split(" ");
        String[] wordsOfMagazine = magazineText.split(" ");

        for(String word: wordsOfMessage) {
            if(matchWordsToMagazine.containsKey(word)) {
                matchWordsToMagazine.put(word, matchWordsToMagazine.get(word) + 1);
            }
            else {
                matchWordsToMagazine.put(word, 1);
            }
        }

        for(String word: wordsOfMagazine) {
            if(matchWordsToMagazine.containsKey(word)) {
                matchWordsToMagazine.put(word, matchWordsToMagazine.get(word) - 1);
            }
        }

        boolean canYouMakeMessage = true;
        for(Map.Entry<String, Integer> numWords: matchWordsToMagazine.entrySet()) {
            //not enough words in the magazine
            if(numWords.getValue() > 0) {
                canYouMakeMessage = false;
                break;
            }
        }

        return canYouMakeMessage;
    }
}
