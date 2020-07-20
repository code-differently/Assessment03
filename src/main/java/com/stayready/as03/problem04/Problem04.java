package com.stayready.as03.problem04;

import java.util.HashMap;

public class Problem04 {
    public Boolean harmlessRansomNote(String message , String magazineText){
        HashMap<String, Integer> messageOccurs = new HashMap<>();
        HashMap<String, Integer> magazineOccurs = new HashMap<>();
        String[] messageWords = message.split(" ");
        String[] magazineWords = magazineText.split(" ");

        for(String word : messageWords) {
            if(!messageOccurs.containsKey(word)) {
                messageOccurs.put(word, 1);
            } else {
                messageOccurs.replace(word, messageOccurs.get(word) + 1);
            }
        }

        for(String word : magazineWords) {
            if(messageOccurs.containsKey(word)) {
                if(!magazineOccurs.containsKey(word)) {
                    magazineOccurs.put(word, 1);
                } else {
                    magazineOccurs.replace(word, messageOccurs.get(word) + 1);
                }
            }
        }

        for(HashMap.Entry<String, Integer> occur : messageOccurs.entrySet()) {
            if(!magazineOccurs.containsKey(occur.getKey())) {
                return false;
            }
            if(occur.getValue() > magazineOccurs.get(occur.getKey())) {
                return false;
            }
        }

        return true;
    }
}
