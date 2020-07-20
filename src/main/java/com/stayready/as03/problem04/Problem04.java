package com.stayready.as03.problem04;

import java.util.HashMap;

public class Problem04 {
    public Boolean harmlessRansomNote(String message , String magazineText){
        HashMap<String, Integer> note = new HashMap<>();
        for(String word : magazineText.split(" ")) {
            if(!note.containsKey(word)) {
                note.put(word, 1);
            } else {
                note.put(word, note.get(word)+1);
            }
        }
        for(String word : message.split(" ")) {
            if(!note.containsKey(word)) {
                return false;
            } else if(note.get(word)-1 == 0) {
                note.remove(word);
            } else {
                note.put(word,note.get(word)-1);
            }
        }
        return true;
    }
        
}
