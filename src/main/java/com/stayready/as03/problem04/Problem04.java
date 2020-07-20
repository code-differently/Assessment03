package com.stayready.as03.problem04;

import java.util.HashMap;

public class Problem04
{
    public Boolean harmlessRansomNote(String message , String magazineText)
    {
        String[] magazineStrArr = magazineText.split(" ");
        HashMap<String, Integer> comparison = new HashMap<String, Integer>();

        for(String s : magazineStrArr)
        {
            comparison.put(s, comparison.get(s) == null ? 1 : comparison.get(s) + 1);
        }

        String[] ransomMessageArr = message.split(" ");
        for(String s : ransomMessageArr)
        {
            if(!comparison.containsKey(s))
            {
               return false;
            }

            int counter = comparison.get(s) - 1;
            if(counter == 0)
            {
                comparison.remove(s);
            }
            else
            {
                comparison.put(s, counter);
            }
        }

        return true;
    }
}
