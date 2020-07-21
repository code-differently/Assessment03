package com.stayready.as03.problem04;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

public class Problem04 {
    public Boolean harmlessRansomNote(String message , String magazineText){
        String msgArr[] = message.split(" ");
        String magArr[] = magazineText.split(" ");

        HashSet<String> note = new HashSet<>();
        Hashtable<String,Integer> noted = new Hashtable<>();
        HashMap<String, Integer> nte = new HashMap<>();

        for(String word:magArr){
            if(nte.containsKey(word))
                nte.put(word,nte.get(word)+1);
            else
                nte.put(word,1);
        }

        for(String word:msgArr){
            if(nte.containsKey(word)){
                if(nte.get(word)>1)
                    nte.put(word,nte.get(word)-1);
                else
                    nte.remove(word);
            }else
                return false;
        } return true;
    }
}
