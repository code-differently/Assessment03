package com.stayready.as03.problem00;

public class Problem00 
{
    public String countUniqueWords(String input)
    {
        String result = "";
        String getUnique = "";
        int count = 0;
        int howUnique = 0;
        String [] words =  input.split(" ");
        

        for (int i = 0; i < words.length;i++)
        {
           count = 1;
            for (int j = i + 1; j < words.length;j++)
            {
                if (words[i].equals(words[j]))
                {
                    count++;
                    words[j] = "0";
                }
            }

            if(count >= 1 && words[i] != "0") 
            {   
                howUnique++;
                getUnique += words[i]+" (Seen "+count+")\n";
            }
        }
        result = "The "+(howUnique)+" unique words are:\n";
        result += getUnique.trim();
        
        return result;
    }
}
