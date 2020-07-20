package com.stayready.as03.problem02;

import java.util.HashSet;

public class Problem02 
{

    public int findNumberOfNonMatching(int[] ar) 
    {
        HashSet <Integer> notMatch = new HashSet<>();
        int pairs = 0;

        for (int i = 0; i < ar.length;i++)
        {
            if (!notMatch.add(ar[i]))
            {
                notMatch.remove(ar[i]);
                pairs++;
            }
        }

        return pairs;
    }
}

