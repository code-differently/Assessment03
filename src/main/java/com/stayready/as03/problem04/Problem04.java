package com.stayready.as03.problem04;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Problem04 {
    public Boolean harmlessRansomNote(String message , String magazineText){
        //the specific words in messages must contain the same amount in the magazineText
        //making two hashmaps to store the elements and compare the values
        /* List<String> mag = new ArrayList<String>(); 
        String[] magText = magazineText.split(" "); 
        for(String word: magText){
            mag.add(word);
        } */
        
        String[] magText = magazineText.split(" "); 
        String[] mess = message.split(" "); 
        Map<String, Integer> messageMap = new HashMap<String, Integer>(); 
        Map<String, Integer> magazineMap = new HashMap<String, Integer>(); 

        for(String key : mess){
            if(messageMap.containsKey(key)){
                messageMap.put(key, messageMap.get(key) + 1);
            } else {
                messageMap.put(key,1);
            }
        }

        for(String key : magText){
            if(magazineMap.containsKey(key)){
                magazineMap.put(key, magazineMap.get(key) + 1);
            } else {
                magazineMap.put(key,1);
            }
        }

        for(Entry<String, Integer> entry : messageMap.entrySet()){
            if(!magazineMap.containsKey(entry.getKey())){
                return false;
            } else if (entry.getValue() > magazineMap.get(entry.getKey())){
                return false; 
            }
        }
    
        return true;
    }
}
