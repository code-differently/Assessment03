package com.stayready.as03.problem00;

import java.util.ArrayList;
import java.util.HashMap;

public class Problem00 {

    public String countUniqueWords(String input) {

        input.replace(".*[$&+,:;=?@#|].*", "");
        String[] words = input.split(" ");
        ArrayList<String> list= new ArrayList<>();
        String output = "";
        Integer total = 0;
        Integer num = 0;
        Integer wordTime = 0;
        String wordName = "";
        for (int i = 0; i < words.length - 1; i++) {
            if (i < words.length && !words[i].equals(words[i + 1])) {
                //list.add(words[i]);
                total++;
                i = i + 1;
                ;
            }
        }
        output = String.format("The %d unique words are:\n", total);
        // get how many for each word

        for (int j = 0; j < words.length - 1; j++) {
                if (words[num].equals(words[j])) {
                    wordTime++;
                    wordName = words[num];
                }
        }
        output += String.format("%s (Seen %d)\n", wordName, wordTime);

        return output;
    }
}
