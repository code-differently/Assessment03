package com.stayready.as03.problem00;

import java.util.ArrayList;
import java.util.HashMap;

public class Problem00 {
    public String countUniqueWords(String input){
        String output;
        HashMap<String, Integer> words=new HashMap<String,Integer>();
        ArrayList<String> wordOrder=new ArrayList<String>();
        String newS=input.replaceAll("[!.?]","");
        String[] split=newS.split(" ");
        for (String word :
            split) {
            if (words.get(word) == null) {
                wordOrder.add(word);
                words.put(word, 1);
            }
            else {
                int temp=words.get(word) +1;
                words.replace(word,temp);
            }
        }
        output="The "+words.size()+" unique words are:\n";
        for (String word :
            wordOrder) {
            output+=String.format("%s (Seen %d)\n",word,words.get(word));
        }
        return output.trim();


    }
}
