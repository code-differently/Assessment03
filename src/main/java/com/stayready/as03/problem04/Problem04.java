package com.stayready.as03.problem04;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Problem04 {
    /*public Boolean harmlessRansomNote(String message , String magazineText){
    //attemption to do a dicitonary comparsion of words in a nested loop and removing words from string message
        // and string magazineText at the same time... assuming that the test should have if and only if "wantedWords"'s
        //hashmap has the size of 0 (empty) but its not working


        HashMap<String, Integer> wantedWords = tally(message.split(" "));
        HashMap<String, Integer> availiableWords = tally(magazineText.split(" "));

        //outer loop of words needed to generate message
        for (Map.Entry<String, Integer> neededWord: wantedWords.entrySet()) {

            //inner loop of words availbiable to be used
            for (Map.Entry<String, Integer> useableWord: availiableWords.entrySet()) {
                if (availiableWords.containsKey(neededWord)) {
                    if (availiableWords.get(neededWord) > 1) {
                        //word taken from word bank glossary
                        availiableWords.put(neededWord.getKey(), neededWord.getValue() - 1);

                        //needed word crossed out from the list
                        wantedWords.put(neededWord.getKey(), neededWord.getValue() - 1);
                    } else {
                        availiableWords.remove(neededWord.getKey());
                        wantedWords.remove(neededWord.getKey());
                    }
                } else {
                    continue;
                    //return false;
                }
            }
        }

        if (wantedWords.size() == 0)
        {
            return true;
        } else {
            return false;
        }
    }*/

    public Boolean harmlessRansomNote(String message , String magazineText)
    {
        HashMap<String, Integer> wantedWords = tally(message.split(" "));
        HashMap<String, Integer> availiableWords = tally(magazineText.split(" "));

        boolean makeable_message = true;
        String outcome = "";

        //iterating thought the dictionary of wanted words
        //ransom is disqualified if magazine does not have the words OR enough words
        for (String needed_word: wantedWords.keySet())
        {
            if (!availiableWords.containsKey(needed_word) || (availiableWords.get(needed_word) < wantedWords.get(needed_word)))
            {
                makeable_message = false;
                break;
            }
        }

        if (makeable_message == true) {
            return true;
        } else {
            return false;
        }
    }


    public HashMap<String, Integer> tally(String[] words)
    {
        HashMap<String, Integer> total = new HashMap<>();

        for (int i = 0; i < words.length; i++)
        {
            if (!total.containsKey(words[i]))
            {
                total.put(words[i], 1);
            }
            else {
                total.put(words[i], total.get(words[i]) + 1);
            }
        }
        return total;
    }

    public static void main(String[] args) {
        Problem04 test = new Problem04();
        String noteText = "this is a secret note for you from a secret admirer";
        String[] ugh = noteText.split(" ");
        System.out.println(test.tally(ugh));
    }
}
