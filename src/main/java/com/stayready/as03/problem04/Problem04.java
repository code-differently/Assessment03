package com.stayready.as03.problem04;

import java.util.Hashtable;

public class Problem04
{
    public Boolean harmlessRansomNote(String message , String magazineText)
    {
        Hashtable<String, Integer> magazineHashMap = new Hashtable<String, Integer>();

        boolean result = true;

        for(String word : magazineText.split(" "))
        {
            Integer count = magazineHashMap.get(word);

            if(count != null)
            {
                magazineHashMap.put(word, count + 1);
            }
            else
            {
                magazineHashMap.put(word, 1);
            }
        }

        for(String word : message.split(" "))
        {
            Integer count = magazineHashMap.get(word);

            if(count == null || count == 0)
            {
                result = false;
            }
            else
            {
                magazineHashMap.put(word, count - 1);
            }
        }

        return result;
    }
}
