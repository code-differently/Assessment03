package com.stayready.as03.problem00;

import java.util.HashMap;

public class Problem00 {
    public String countUniqueWords(String input){

        HashMap<String, Integer> words = new HashMap<>();
        int num = 0;
        for(String word: input.split(" ")) {
            if(words.containsKey(word)) {
                words.replace(word, words.get(word)+1);
            } else {
                words.put(word,1);
                num++;
            }
        }
        String output = "The" + num + "unique words are:\n";
        for(String w: words.keySet()) {
            output += w + "(Seen " +words.get(w) + ")\n";
            
        }
        return output;
    }
}
