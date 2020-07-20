package com.stayready.as03.problem04;
import java.util.Hashtable;
import java.util.Map;
import java.util.HashMap;

public class Problem04 {
    public Boolean harmlessRansomNote(String ransomNote , String magazine) {
        Hashtable<String, Integer> magazineHash = new Hashtable<String, Integer>();
        boolean verdict = true;

        for(String word: magazine.split(" ")) {
            Integer count = magazineHash.get(word);
            if(count != null) {
                magazineHash.put(word, count +1) ;
            } else {
                magazineHash.put(word, 1) ;
            }
        }

        for(String word: ransomNote.split(" ")) {
            Integer count = magazineHash.get(word);

            if(count == null || count == 0) {
                verdict = false;
                break;
            } else {
                magazineHash.put(word, count-1);
            }
        }

        return verdict ;
    }

}

