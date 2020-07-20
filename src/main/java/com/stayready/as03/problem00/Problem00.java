package com.stayready.as03.problem00;


public class Problem00 {
    public String countUniqueWords(String input){
            String [] words = input.split(" ");
            Integer wordCount = 1;
            String unique ="";
            for(int i = 0; i<words.length; i++)
            {
                for(int j = i+1; j< words.length; j++)
                {
                    if(words[i].equals(words[j]))
                    {
                        wordCount = wordCount +1;
                        words[j]= "0";
                    }
                    

                }
                    if(words[i] != "0")
                    {
                        unique = unique + words[i] + "(seen " + Integer.toString(wordCount) + ")" + "\n";
                    }
                    wordCount = 1;
            }


        return unique;
    }
}
