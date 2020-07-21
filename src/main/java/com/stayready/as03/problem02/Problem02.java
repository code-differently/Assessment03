package com.stayready.as03.problem02;

import java.util.Arrays;
import java.util.ArrayList;

public class Problem02 {

    public int findNumberOfNonMatching(int[] ar) {
        Arrays.sort(ar);
        ArrayList <Integer> noPairs = new ArrayList <Integer>();
        int previous = 3;
        int count = 0;
        for (int i = 1; i < ar.length; i++){
            previous = ar [i - 1];
            if (previous == ar[i]){
                count++;
                noPairs.add(ar[i]);
                i++;
            }

        }
        return noPairs.size();
    }
}

