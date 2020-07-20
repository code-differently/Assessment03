package com.stayready.as03.problem00;

import java.util.HashSet;
import java.util.Set;

public class Problem00 {
    public String countUniqueWords(String input){
        Set<String> uniquSet = new HashSet<>();
        String [] words = input.split(" ");
        String uniqueWords= "";
        for(int i =0; i<words.length; i++)
        {
            uniquSet.add(words[i]);
           
        }
        uniqueWords = uniquSet.toString();
        
        return uniqueWords;
    }
}
