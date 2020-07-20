package com.stayready.as03.problem02;

import java.util.Arrays;

public class Problem02 {

    public int findNumberOfNonMatching(int[] ar) {
        
        int sockPairs = 0;
        Arrays.sort(ar);
        
        for(int i = 0; i < ar.length - 1; i++){
            if(ar[i] == ar[i+1]){
                i++;
                sockPairs++;
            }
        }

        return sockPairs;
    }

}

