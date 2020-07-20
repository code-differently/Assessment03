package com.stayready.as03.problem00;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Problem00 {
    public String countUniqueWords(String input){
        Map<String, Integer> map = new HashMap<String, Integer>();
        //input = input.replaceAll("[^a-zA-Z0-9]", "");
        String[] s = input.replaceAll("\\p{P}", "").split(" ");
        System.out.println(s[0]); 

        for(String word : s){
            if(map.containsKey(word)){
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }

        int mapSize = map.size(); 
        String answer = "The " + mapSize +  " unique words are:";

        for(Entry<String, Integer> entry : map.entrySet()){
           answer += "\n" + entry.getKey() + " (Seen "+ entry.getValue() + ")";
        }

        return answer;
    }
}
