package com.stayready.as03.problem02;

import java.util.Arrays;

public class Problem02 {

    public int findNumberOfNonMatching(int[] ar) {
        Arrays.sort(ar);
        int pairs = 0;
        for (int j = 1; j < ar.length; j++) {
            if (ar[j] == ar[j - 1]) {
                continue;
            } else {
                pairs += 1;
            }
        }
        return pairs;
    }
}
