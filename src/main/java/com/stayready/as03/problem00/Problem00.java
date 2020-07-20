package com.stayready.as03.problem00;

import java.util.HashMap;

public class Problem00 {
    public String countUniqueWords(String input){
        HashMap<String, Integer> map = new HashMap<>();
        input = input.replaceAll("[-+.^:,!]","");
        String [] word = input.split(" ");
        int count = 0;
        for(int i = 0; i < word.length; i++){
            if(map.containsKey(word[i])){
                map.replace(word[i], map.get(word[i])+1);
            }else {
                map.put(word[i], 1);
                count++;
            }
        }
        String result = "The "+ count+ " unique words are:\n";
        for(String s:map.keySet()){
           result+= s + " (Seen " + map.get(s) +")\n";
        }
        return result.trim();
    }
}
