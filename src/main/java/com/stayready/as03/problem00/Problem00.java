package com.stayready.as03.problem00;

import java.util.LinkedHashMap;
import java.util.logging.Logger;

public class Problem00 {
    private final static Logger myLogger = Logger.getLogger("com.stayread.as03.problem00");

    public static void main(String[] args) {
        System.out.println((new Problem00()).countUniqueWords("Hello Java. Hello World. Hello Java!"));
    }

    public String countUniqueWords(String input) {
        String[] inputArr =  input.replaceAll("[^A-Za-z0-9\\s]", "").split(" ");
        LinkedHashMap<String, Integer> uniqueWords = new LinkedHashMap<String, Integer>();
        for(String word: inputArr) {
            uniqueWords.merge(word, 1, Integer::sum);
        }
        return printUniqueWords(uniqueWords);
    }

    private String printUniqueWords(LinkedHashMap<String, Integer> uniqueWords) {
        StringBuilder buildAnswer = new StringBuilder();
        int size = uniqueWords.size();
        buildAnswer.append("The " + size + " unique words are:\n");

        uniqueWords.forEach((key, value) -> {
            buildAnswer.append(key + " (Seen " + value + ")\n");
        });

        String answer = buildAnswer.toString();
        return answer.substring(0, answer.length() - 1); //removing the last \n
    }
}
