package com.stayready.as03.problem00;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Problem00 {
    public String countUniqueWords(String input){
        //input = input.replaceAll("[^a-zA-Z0-9]", " ");
        String[] words = input.split(" ");
        HashMap<String, Integer> seen_history = new HashMap<>();

        for (int i = 0; i < words.length; i++)
        {
            words[i] = words[i].replaceAll("[^a-zA-Z0-9]","");
        }


        for (int i = 0; i < words.length; i++)
        {
            if (!seen_history.containsKey(words[i]))
            {
                seen_history.put(words[i], 1);
            }
            else {
                seen_history.put(words[i], seen_history.get(words[i]) + 1);
            }
        }

        String output = "The "+seen_history.size()+" unique words are:"+"\n";

//        Iterator iter = seen_history.entrySet().iterator();
//        while (iter.hasNext())
//        {
//            HashMap<String, Integer> entry = (HashMap)iter.next();
//            System.out.println(seen_history.get(entry));
//        }

        String line_entry = "";
        for (Map.Entry<String, Integer> entry: seen_history.entrySet())
        {
            String word = entry.getKey();
            int value = entry.getValue();
            line_entry += word + " (Seen "+value+")"+"\n";
        }

        return output + line_entry;
    }

    public static void main(String[] args) {
        Problem00 test = new Problem00();
        System.out.println(test.countUniqueWords("slay these! these losers"));
        //System.out.println();
    }

}
