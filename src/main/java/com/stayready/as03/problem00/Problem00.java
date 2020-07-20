package com.stayready.as03.problem00;

import java.util.HashMap;
import java.util.Map;

public class Problem00 {
    public String countUniqueWords(String input) {
        int whereInTheString = 0;
        HashMap<Integer, HashMap<String, Integer>> countOccurances = new HashMap<>();
        HashMap<String, Integer> whereInTheBigWord = new HashMap<>();
        String[] words = input.split("\\W");

        for (String word : words) {
            if (whereInTheBigWord.containsKey(word)) {
                int index = whereInTheBigWord.get(word);
                countOccurances.get(index).put(word, countOccurances.get(index).get(word) + 1);
            }
            else if(!word.equals("")) {
                whereInTheBigWord.put(word, whereInTheString);
                //need to have that position not null
                countOccurances.put(whereInTheString, new HashMap<String, Integer>());
                countOccurances.get(whereInTheString).put(word, 1);
                whereInTheString++;
            }
        }

        StringBuilder answer = new StringBuilder();
        answer.append("The " + countOccurances.size() + " unique words are:\n");

        for (Map.Entry<Integer, HashMap<String, Integer>> indexes : countOccurances.entrySet()) {
            for(Map.Entry<String, Integer> count: indexes.getValue().entrySet()) {
                if(indexes.getKey() != whereInTheString - 1) {
                    answer.append(count.getKey() + " (Seen " + count.getValue() + ")\n");
                }
                else {
                    answer.append(count.getKey() + " (Seen " + count.getValue() + ")");
                }
            }
        }

        return answer.toString();
    }
}
