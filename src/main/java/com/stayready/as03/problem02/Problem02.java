package com.stayready.as03.problem02;

import java.util.HashSet;

public class Problem02 {

    public int findNumberOfNonMatching(int[] ar) {
        HashSet<Integer> numberOfSingleSocks = new HashSet<>();
        for(int sock: ar) {
            if(numberOfSingleSocks.contains(sock)) {
                numberOfSingleSocks.remove(sock);
            }
            else {
                numberOfSingleSocks.add(sock);
            }
        }
        return numberOfSingleSocks.size();
    }

}

