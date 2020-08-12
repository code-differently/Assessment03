package com.stayready.as03.problem02;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Problem02 {

    public static int findNumberOfNonMatching(Integer[] sockPile) {
        HashSet<Integer> uniqueSocks = new HashSet<Integer>();
        for (Integer colorSock : sockPile) {
            if (!uniqueSocks.contains(colorSock)) {
                uniqueSocks.add(colorSock);
            } else {
                uniqueSocks.remove(colorSock);
            }
        }
        return uniqueSocks.size();
    }

}

