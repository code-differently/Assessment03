package com.stayready.as03.problem02;

import java.util.Arrays;

public class Problem02 {

    public int findNumberOfNonMatching(int[] ar) {
        return ar.length - (numOfPairs(ar) * 2);
    }

    // Returns number of pairs of socks in array pile
    static int numOfPairs(int[] ar) {
        Arrays.sort(ar);
        int count = 0;
        for(int i = 0; i < ar.length - 1; i++){
            if(ar[i] == ar[i+1]){
                count++;
                i++;
            }
        }
        return count;
    }

}

