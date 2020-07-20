package com.stayready.as03.problem04;

import java.util.HashMap;

public class Problem04 {
    public Boolean harmlessRansomNote(String message , String magazineText){
        boolean bool = true;
        String[] words = message.split("\\s+");
        String[] words1 = magazineText.split("\\s+");
        HashMap<String, Integer> messageMap = new HashMap<String, Integer>();
        HashMap<String, Integer> magazineMap = new HashMap<String, Integer>();
        for(int i = 0; i < words.length; i++){
                messageMap.put(words[i], 1);
                int total = messageMap.get(words[i]) + 1;
                messageMap.replace(words[i],total);
            }
        for(int j = 0; j < words1.length; j++){
            if(messageMap.get(words1[j]) == null){
                messageMap.put(words1[j], 1);
            }
            else{
                int total = messageMap.get(words1[j]) + 1;
                messageMap.replace(words1[j],total);
            }
        }
        for (String str: messageMap.keySet()) {
            if(messageMap.get(str) != magazineMap.get(str)){
                bool = false;
            }
        }
        return bool;
    }
}
