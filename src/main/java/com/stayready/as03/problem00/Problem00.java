package com.stayready.as03.problem00;

import java.util.HashMap;
import java.util.Map;

public class Problem00 {
    public static String countUniqueWords(String input){
        HashMap<String, Integer> uniqueWords = new HashMap<>(); // create hashmap
        String[] sntnc = input.split(" "); // create String array to hold strings
        for (String word : sntnc) { // iter through array
            if (uniqueWords.containsKey(word)){ // if the hashmap does contain word
                int count = uniqueWords.get(word); //get value of key, word
                uniqueWords.put(word,count + 1); // place value back, incremented
            } else { // if hashmap doesn't contain word
                uniqueWords.put(word, 1); // make new mapping with word as key and initialize value as 1
            }
        }

        String result = String.format("The %d unique words are:", uniqueWords.size());
        for (Map.Entry word : uniqueWords.entrySet()) {
            result += String.format("\n"+ word + " (Seen %d)", word.getValue());
        }
        return result;
//        uniqueWords.forEach((String, Integer) -> {
//            result +=
//        });

    }
}
