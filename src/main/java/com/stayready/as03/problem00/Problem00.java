package com.stayready.as03.problem00;


import java.util.HashSet;

public class Problem00 {
    public String countUniqueWords(String input){
        int count = 0;
        int wordcount= 0;
        
        String[] inputArr = input.split(" ");
        input = input.replaceAll("[^a-zA-Z0-9]", " ");
        input = input.replaceAll("  ", " ");
        
        
        
        
        HashSet<String> uniqueWords = new HashSet<String>();
        input = input.trim();
        String[] words = input.split(" ");
        
        for(String s : words){
            if(uniqueWords.contains(s) == false){
                uniqueWords.add(s);
                wordcount++;
            }
        }

        String result = "The " + wordcount + " unique words are:\n";
        
        for(String word: uniqueWords){
            for(String aword: words){
                if(word.equals(aword)){
                    count++;
                }
            }
            result += word + " (Seen " + count + ")\n";
            count = 0;
        }
        
        System.out.println(result);
        return result.trim();
    }
}


