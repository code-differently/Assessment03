package com.stayready.as03.problem04;

import java.util.HashMap;

public class Problem04 {
    public Boolean harmlessRansomNote(String message , String magazineText){
        HashMap<String, Integer> map = new HashMap<>();
        String [] word = magazineText.split(" ");
        for(int i = 0; i < word.length; i++){
            if(map.containsKey(word[i])){
                map.replace(word[i], map.get(word[i])+1);
            }else {
                map.put(word[i], 1);
            }
        }
       word = message.split(" ");

        for(String w : word){
            if(map.containsKey(w)){
                if(map.get(w) > 1){
                    map.replace(w, map.get(w)-1);
                }else {
                    map.remove(w);
                }
            }
            else{
                return false;
            }
        }
        return true;
    }
}
