package com.stayready.as03.problem02;

import java.util.Arrays;

public class Problem02 {

    public int findNumberOfNonMatching(int[] ar) {
        Arrays.sort(ar);
        int numberOfNonPairs = 0;
        for(int i = 1; i < ar.length; i++){
    if(ar[i] == ar[i - 1]){
        continue;
    }else{
        numberOfNonPairs += 1;
    }
        }
        return numberOfNonPairs;
    }

}

