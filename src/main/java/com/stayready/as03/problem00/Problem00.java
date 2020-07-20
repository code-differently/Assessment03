package com.stayready.as03.problem00;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Problem00 {
    public String countUniqueWords(String input) {

        HashMap<String, Integer> words=new HashMap<String,Integer>();
        ArrayList<String> wordOrder=new ArrayList<String>();

        String wordsOnly = input.replaceAll("[^a-zA-Z0-9\\s]", "");
        String[] split = wordsOnly.split(" ");

        for (String word : split) {
            if (words.get(word) == null) {
                wordOrder.add(word);
                words.put(word, 1);
            }
            else {
                int temp = words.get(word) + 1;
                words.replace(word, temp);
            }
        }

        StringBuilder output= new StringBuilder("The " + words.size() + " unique words are:\n");

        for(Map.Entry<String, Integer> hash : words.entrySet())
        {
            String key = hash.getKey();
            int value = hash.getValue();

            output.append(key + " (Seen " + value + ")");
            output.append("\n");
        }

        return output.toString();
    }

    }