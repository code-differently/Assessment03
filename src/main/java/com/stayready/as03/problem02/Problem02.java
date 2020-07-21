package com.stayready.as03.problem02;

import java.util.HashSet;

public class Problem02 {

    public int findNumberOfNonMatching(int[] ar) {
        HashSet<Integer> nonMatch = new HashSet<>();

        for(int i=0; i<ar.length;i++)
            if(!nonMatch.add(ar[i])){
                nonMatch.remove(ar[i]);
            }
        return nonMatch.size();
    }

}

