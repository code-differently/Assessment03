package com.stayready.as03.problem00;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;

public class Problem00 {
    HashMap<String, Integer> words=new LinkedHashMap<>();
    public String countUniqueWords(String input){
        //HashSet<String[]> words=new HashSet<>();
        String sb ="";
        for (int i=0; i < input.length(); i++) {
            if (Character.isLetter(input.charAt(i))||Character.isSpaceChar(input.charAt(i))) {
                sb+=(input.charAt(i));
            }
        }
        String[] in=sb.split("\\s+");
        //int count=0;
        for (int i=0;i<in.length;i++) {
            String uniq= (String) Array.get(in,i);
            if (words.containsKey(uniq)) {
                words.put(uniq, words.get(uniq) + 1);
            } else {
                words.put(uniq, 1);
            }
        }

        int size=words.keySet().size();
        String str = "The "+ size+" unique words are:\n";
        for(String c: words.keySet()){
            str+= c+ " (Seen "+words.get(c)+")\n";
        }
        return str;
    }
//
}
