package com.stayready.as03.problem02;

import java.util.HashSet;

public class Problem02 {

    public int findNumberOfNonMatching(int[] ar) {
        int result = 0;
        HashSet<Integer> uniqueNums = new HashSet<Integer>();
        for(int num : ar){
            if(uniqueNums.contains(num) == false){
                uniqueNums.add(num);
            }
        }
        int pairCount = 0;
        for(int prospect: uniqueNums){
            for(int s : ar){
                if(s==prospect){
                    pairCount++;
                }
                if(pairCount == 2){
                    pairCount -= 2;
                }
            }
            result += pairCount;
            pairCount = 0;
        }
        return result;
    }

}

