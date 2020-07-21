package com.stayready.as03.problem02;

import java.util.HashSet;
import java.util.Set;

public class Problem02 {

    public int findNumberOfNonMatching(int[] ar) {
        Set<Integer> nonMatchingNumbers = new HashSet<>();
        int nonMatching = 0;

        for(int i=0; i<ar.length; i++){
           if(nonMatchingNumbers.contains(ar[i])){
                nonMatchingNumbers.remove(ar[i]);
                nonMatching++;
           } else{
                nonMatchingNumbers.add(ar[i]);
           }
        }
        return nonMatching ; 
    }

}

