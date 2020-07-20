package com.stayready.as03.problem00;

import java.util.HashMap;

public class Problem00 {
    public String countUniqueWords(String input){

        HashMap<String, Integer> hmap = new HashMap<String, Integer>();
        String uniqueWords = "";

        String[] words = input.split(" ");

        for(String word : words){
            word = word.replaceAll("\\p{Punct}", "");

            if(hmap.containsKey(word)){
                int current = hmap.get(word);
                current++;
                hmap.put(word, current);
            }
            else    {
                hmap.put(word, 1);
                uniqueWords += word + " ";
            }

        }

        String output = "The " + hmap.size() + " unique words are:\n";
        String[] uw = uniqueWords.split(" ");

        for(int i = 0; i < uw.length; i++){
            String w = uw[i];
            String newLine = "";

            if(i == uw.length - 1)
                newLine = w + " (Seen " + hmap.get(w) +")";
            else
                newLine = w + " (Seen " + hmap.get(w) +")\n";
                
            output += newLine;
        }

        return output;
    }
}
