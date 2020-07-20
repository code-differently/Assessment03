package com.stayready.as03.problem02;

import java.util.HashSet;
import java.util.Set;

public class Problem02 {

    public int findNumberOfNonMatching(int[] ar) {
        Set <Integer> socks = new HashSet<>();
        int unmatchedSets = 0; 
        for(int i =0; i<ar.length; i++)
        {
            if(!socks.contains(ar[i]))
            {
                unmatchedSets++;
                socks.add(ar[i]);
            }
            else
            {
                socks.remove(ar[i]);
            }
        }
        return unmatchedSets/2;
    }

}

