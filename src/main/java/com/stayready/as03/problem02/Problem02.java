package com.stayready.as03.problem02;

import java.util.HashSet;

public class Problem02 {

    public int findNumberOfNonMatching(int[] ar) {
            HashSet<Integer> socks = new HashSet<>();//only holds unique values
            int pairs = 0;//counter
        for (int value : ar) {//goes through the array
            if (!socks.add(value)) {//if it can't be added to set
                socks.remove(value);//remove it to find other pairs of same color
                pairs++;//count pairs
            }
        }
            return pairs;
        }

}

