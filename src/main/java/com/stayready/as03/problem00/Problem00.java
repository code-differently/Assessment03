package com.stayready.as03.problem00;

import java.util.HashMap;
import java.util.Map;

public class Problem00
{
    public String countUniqueWords(String input)
    {
        String onlyWords = input.replaceAll("[^a-zA-Z0-9\\s]", "");
        String[] stringArr = onlyWords.split(" ");

        HashMap<String, Integer> countUnique = new HashMap<>();
        int countWords = 0;

        for(String s : stringArr)
        {
            //just uses this to count the unique words
            if(!countUnique.containsKey(s))
            {
                countWords++;
            }
            countUnique.put(s, countUnique.get(s) == null ? 1 : countUnique.get(s) + 1);
        }

        StringBuilder output = new StringBuilder("The " + countWords + " unique words are:\n");

        for(Map.Entry<String, Integer> hash : countUnique.entrySet())
        {
            String key = hash.getKey();
            int value = hash.getValue();

            output.append(key + " (Seen " + value + ")");
            output.append("\n");
        }

        return output.toString();
    }

    public static void main(String[] args) {

        System.out.println(new Problem00().countUniqueWords("Hello Java. Hello World. Hello Java!"));
    }
}
