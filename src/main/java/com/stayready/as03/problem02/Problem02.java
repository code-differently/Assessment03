package com.stayready.as03.problem02;

public class Problem02 {

    public int findNumberOfNonMatching(int[] ar) {
        int count = 1;
        int unmatched = 0;
        for(int i = 0; i < ar.length; i++){
            for(int j = 1; j < ar.length; j++){
                if(ar[i] == ar[j] && ar[i] != 0){
                    count++;
                    ar[j] = 0;
                }
            }
            if(count % 2 != 0){
                unmatched++;
            }
            count = 1;
        }
        return unmatched;
    }

}

