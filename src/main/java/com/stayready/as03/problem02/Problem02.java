package com.stayready.as03.problem02;

import java.util.HashSet;

public class Problem02 {
    public int findNumberOfNonMatching(int[] ar){

            int count = 0;
            HashSet<Integer> hashSet = new HashSet<>();

            for(int i : ar) {
                if(!hashSet.contains(i)){
                    count++;
                    hashSet.add(i);
                } else {
                    count--;
                    hashSet.remove(i);
                }
            }
            return count;
        }
}

