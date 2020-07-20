package com.stayready.as03.problem02;

import java.util.HashMap;

public class Problem02 
{
    public int findNumberOfNonMatching(int[] ar) 
    {
        int notMatch = 0;
        
        HashMap<Integer, Integer> match = new HashMap<>();

        for(int currentPair : ar)
        {
            if(!match.containsKey(currentPair))
            {
                match.put(currentPair, 1);
            }
            else
            {
                match.replace(currentPair, match.get(currentPair) + 1);
            }
        }

        for (HashMap.Entry<Integer, Integer> occur : match.entrySet())
        {
            if(occur.getValue() % 2 != 0)
            {
                notMatch++;
            }
        }

        return notMatch;
    }

}

