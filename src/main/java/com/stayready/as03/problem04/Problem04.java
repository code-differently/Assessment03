package com.stayready.as03.problem04;

import java.util.HashMap;

public class Problem04 {
    HashMap<String, Integer> matchWordsToMagazine = new HashMap<>();
    public Boolean harmlessRansomNote(String ransom , String magazineText){
        String[] wordsOfRansom = ransom.split(" ");
        String[] wordsOfMagazine = magazineText.split(" ");
        fillAvailableWordsFromMagazine(wordsOfMagazine);
        return doesMagazineHaveAllTheWordsNeeded(wordsOfRansom);

    }
    private void fillAvailableWordsFromMagazine(String[] magazineWords) {
        for(String word: magazineWords) matchWordsToMagazine.merge(word, 1, Integer::sum);
    }

    private boolean doesMagazineHaveAllTheWordsNeeded(String[] ransomWords) {
        for(String word: ransomWords) {
            if(matchWordsToMagazine.containsKey(word)) {
                matchWordsToMagazine.put(word, matchWordsToMagazine.get(word) - 1);
            }
            //as soon as there is not a word available in the magazine, return false
            if(matchWordsToMagazine.get(word) == -1) {
                return false;
            }
        }
        return true;
    }
}
