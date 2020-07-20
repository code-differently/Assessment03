package com.stayready.as03.problem02;

import java.util.Arrays;

public class Problem02 {

    public int findNumberOfNonMatching(int[] ar) {
        Arrays.sort(ar);
        int nonMatches = 0;
        for (int i = 0; i < ar.length - 1; i++) {
            if (ar[i] != ar[i + 1]) {
                nonMatches++;
            }
        }
        return nonMatches;
    }

}

