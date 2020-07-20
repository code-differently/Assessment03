package com.stayready.as03.problem00;

import java.util.HashMap;
import java.util.Map;

public class Problem00 {
    public String countUniqueWords(String input){
        // JUnit expected output is too hardcoded

        Map<String, Integer> hm = new HashMap<String, Integer>();
        input = input.replaceAll("\\p{Punct}", "");
        String[] words = input.split(" ");
        for (String s : words) {
            if (hm.containsKey(s)) {
                hm.put(s, hm.get(s) + 1);
            } else {
                hm.put(s, 1);
            }
        }
        StringBuilder output = new StringBuilder("The ");
        output.append(hm.size() + " unique words are:");
        for (Map.Entry<String, Integer> entry : hm.entrySet()) {
            output.append("\n" + entry.getKey() + " (Seen " + entry.getValue() + ")");
        }
        return output.toString();
    }
}
