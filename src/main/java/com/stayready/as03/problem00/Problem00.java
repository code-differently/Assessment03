package com.stayready.as03.problem00;

import java.util.HashMap;

public class Problem00 {
    public String countUniqueWords(String input) {

        HashMap<String, Integer> hm = new HashMap<>();
        String input2 = input.replaceAll("!", "");
        String input3 = input2.replace(".", "");
        String[] words = input3.split(" ");

        for (int i = 0; i < words.length; i++) {
            hm.put(words[i], hm.getOrDefault(words[i], 0) + 1);
        }

        String answer = "The " + hm.size() + " unique words are:";

        for (int i = 0; i < words.length; i++) {
            if (hm.containsKey(words[i])) {
                answer += "\n";
                answer += words[i] + " (Seen " + hm.get(words[i]) + ")";
                hm.remove(words[i]);
            }
        }

        return answer;
    }
}
