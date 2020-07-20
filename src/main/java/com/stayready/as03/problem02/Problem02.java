package com.stayready.as03.problem02;

public class Problem02 {

    public int findNumberOfNonMatching(int[] ar) {
        int numPairs = 0;
        
        int[] freq = new int[101];
       
        for(int sock: ar)
            freq[sock]++;
        
        for(int nonPairs: freq)
            numPairs += nonPairs / 2;
        return numPairs;
    }

}

