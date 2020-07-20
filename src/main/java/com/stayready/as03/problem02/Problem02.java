package com.stayready.as03.problem02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Problem02 {

    public int findNumberOfNonMatching(int[] ar) {
        ArrayList<Integer> arr = new ArrayList<>();
        Arrays.sort(ar);
        Integer count = 1;
        if (ar.length == 0){
            return 0;
        }
        if (ar.length == 1){
            return 1;
        }
        for (int i = 1; i < ar.length; i++){
            if (ar[i] == ar [i - 1]){
                ar[i] = 0;
                ar[i-1] = 0;
                i++;
            }
            else{
                count++;
            }
        }
        return count;
    }

}

