package com.stayready.as03.problem00;

import java.util.HashMap;

public class Problem00 {
    public String countUniqueWords(String input){
        int unique = 0;
        HashMap<String, Integer> occurrences = new HashMap<>();

        StringBuilder onlyWordsAndSpaces = new StringBuilder();
        for(int i  = 0; i < input.length(); i++) {
            char current = input.charAt(i);
            if(Character.isLetter(current) || current == ' ') {
                onlyWordsAndSpaces.append(current);
            }
        }

        String[] words = onlyWordsAndSpaces.toString().split(" ");
        for (String current : words) {
            if (!occurrences.containsKey(current)) {
                occurrences.put(current, 1);
                unique++;
            } else {
                occurrences.replace(current, occurrences.get(current) + 1);
            }
        }

        StringBuilder ret = new StringBuilder("The " + unique + " unique words are:\n");
        for(HashMap.Entry<String, Integer> occur : occurrences.entrySet()) {
            ret.append(occur.getKey()).append(" (Seen ").append(occur.getValue()).append(")\n");
        }

        return ret.toString().trim();
    }
}
