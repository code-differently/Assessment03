package com.stayready.as03.problem00;
import java.util.*;
import java.util.HashMap;

public class Problem00 {
    public String countUniqueWords(String input){
        String wordsSeen = " ";
        //split the string into words so can iterate through it
        String newString[] = input.split(" ");
        //creating a new hashmap
        HashMap<String, Integer> countWords= new HashMap<String,Integer>();
        //add values in new hashmap
        for(String word: newString){
            //if the word is already in countWords, increment the value
            if (countWords.get(word) != null){
                countWords.put(word, countWords.get(word)+1);
            }else{
                countWords.put(word, 1);
            }
        }
        //take out all the keys in the hashmap
        Set<String> wordsInInput = countWords.keySet();

        //loop through all the words in countWords
        for(String word : wordsInInput){
            wordsSeen +=   word + " " + "(Seen " + countWords.get(word) + ")\n";



        }

        return wordsSeen;
    }
}
