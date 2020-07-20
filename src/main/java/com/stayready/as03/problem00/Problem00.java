package com.stayready.as03.problem00;

import java.util.*;
import java.util.HashMap;

import java.util.Map;

public class Problem00 {
    public String countUniqueWords(String input) {
        Map<String, String> map = new HashMap<String, String>();
        if (input != null) {
            input = input.replace(".", " ");
            input = input.replace("!", " ");
            input = input.replace("  ", " ");
            String[] sp = input.split(" ");
            for (String word : sp) {
                if (map.containsKey(word)) {
                    int count = Integer.parseInt(map.get(word));
                    map.put(word, String.valueOf(count + 1));
                } else {
                    map.put(word, "1");
                }
            }
        }
        String key = "";
        Object value = 0;
        String outcome = "The " + map.size() + " unique words are: \n";
        for (Map.Entry<String, String> entry : map.entrySet()) {
            value = entry.getValue();
            key = entry.getKey();
            outcome += key + " (Seen " + value + ")\n";
        }
        return outcome;
    }
}