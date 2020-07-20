package com.stayready.as03.problem02;

import java.util.HashMap;
import java.util.Map;

public class Problem02 {

    public int findNumberOfNonMatching(int[] ar) {
        HashMap<Integer, Integer> seen_history = new HashMap<>();

        for (int i = 0; i < ar.length; i++)
        {
            if (!seen_history.containsKey(ar[i]))
            {
                seen_history.put(ar[i], 1);
            }
            else {
                seen_history.put(ar[i], seen_history.get(ar[i]) + 1);
            }
        }

        int non_matching = 0;
        for (Map.Entry<Integer, Integer> entry: seen_history.entrySet())
        {
            if (entry.getValue() % 2 == 1)
            {
                non_matching++;
            }
        }

        return non_matching;
    }

}

