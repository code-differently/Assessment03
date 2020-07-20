package com.stayready.as03.problem04;

import java.util.HashMap;
import java.util.Hashtable;

public class Problem04 {
    public Boolean harmlessRansomNote(String message , String magazineText){
        Hashtable<String, Integer> magazineHash = new Hashtable<String, Integer>();
        boolean isValid = true;

        for(String word: magazineText.split(" ")) {
            Integer count = magazineHash.get(word);
            if(count != null) {
                magazineHash.put(word, count +1) ;
            } else {
                magazineHash.put(word, 1) ;
            }
        }

        for(String word: message.split(" ")) {
            Integer count = magazineHash.get(word);

            if(count == null || count == 0) {
                isValid = false;
                break;
            } else {
                magazineHash.put(word, count-1);
            }
        }

        return isValid;
    }
}
