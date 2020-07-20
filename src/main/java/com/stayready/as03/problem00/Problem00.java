package com.stayready.as03.problem00;

import java.util.*;

public class Problem00 {
    public String countUniqueWords(String input) {
        String string = "";
        String str = "";
        int beginning = 0;
        String[] words=input.split("\\W+");  //Split the word from String
        int wrc=1;    //Variable for getting Repeated word count

        for(int i=0;i<words.length;i++) //Outer loop for Comparison
        {
            for(int j=i+1;j<words.length;j++) //Inner loop for Comparison
            {

                if(words[i].equals(words[j]))  //Checking for both strings are equal
                {
                    wrc=wrc+1;    //if equal increment the count
                    words[j]="0"; //Replace repeated words by zero
                }
            }
            if(words[i]!="0")
                str += "\n" + words[i] + " (Seen " + wrc + ")";
            if(i == 0){
                beginning = wrc;
            }
            wrc=1;

        }
        string += "The " + beginning + " unique words are:";
        return string + str;

    }
}
