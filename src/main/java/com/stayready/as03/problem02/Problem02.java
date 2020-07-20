package com.stayready.as03.problem02;

import java.util.HashMap;

public class Problem02 {

    public int findNumberOfNonMatching(int[] ar) {
        int nonMatch = 0;
        HashMap<Integer, Integer> matches = new HashMap<>();

        for (int current : ar) {
            if (!matches.containsKey(current)) {
                matches.put(current, 1);
            } else {
                matches.replace(current, matches.get(current) + 1);
            }
        }

        for(HashMap.Entry<Integer, Integer> occur : matches.entrySet()) {
            if(occur.getValue() % 2 != 0) {
                nonMatch++;
            }
        }

        return nonMatch;
    }

}

