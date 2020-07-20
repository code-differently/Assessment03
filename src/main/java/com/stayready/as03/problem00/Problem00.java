package com.stayready.as03.problem00;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Problem00 {

    public static void main (String[] args){
        String test = "Hello Java. Hello World. Hello Java!";

        countUniqueWords(test);

    }

    public static String countUniqueWords(String input) {

        Map<String, Integer> table = new HashMap<>();

        String result = input.replaceAll("!", "");
        result = result.replaceAll("\\.", "");
        

        System.out.println(result);

        String [] sentence = result.split(" ");

        for(String word: sentence){

            if (!table.containsKey(word)){//if this is a new word
                table.put(word, 1);

            }else{

                table.replace(word, table.get(word) + 1); //increment value
            }

        }


        String finished = display(table);

        System.out.println(finished);

        

        return finished;
    }

    public static String display(Map<String, Integer> table){

        String msg = "The " + table.size() + " unique words are:\n";

    
        for (Map.Entry<String,Integer> entry : table.entrySet()) {
            msg += (entry.getKey() + " (Seen " + entry.getValue() + ")\n");
        }

        return msg;

    }
}
