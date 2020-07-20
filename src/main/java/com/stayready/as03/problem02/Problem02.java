package com.stayready.as03.problem02;

import java.util.HashSet;

public class Problem02 {

    public int findNumberOfNonMatching(int[] ar) {
        HashSet<Integer> pairs = new HashSet<>();
        for(int sock: ar) {
            if(pairs.contains(sock)) {
                pairs.remove(sock);
            }
            else {
                pairs.add(sock);
            }
        }
        return pairs.size();
    }

}

