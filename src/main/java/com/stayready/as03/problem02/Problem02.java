package com.stayready.as03.problem02;

import java.util.Arrays;

public class Problem02 {

    public int findNumberOfNonMatching(int[] ar) {
        return 0;

        int PairOfSocks = 0;
        Arrays.sort(ar);

        for(int i = 0; i < ar.length; i++){
            if(ar[i] == ar[i + 1]){
                i++;
                PairOfSocks++;

            }
        }

    }
        return PairOfSocks;
}

