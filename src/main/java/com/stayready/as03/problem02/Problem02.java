package com.stayready.as03.problem02;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Problem02 {

    public int findNumberOfNonMatching(int[] ar) {
        Map<Integer, Integer> map = new HashMap<Integer,Integer>(); 
        for(Integer key : ar){
            if (map.containsKey(key)){
                map.put(key, map.get(key) + 1); 
            } else {
                map.put(key, 1);
            }
        }
        int nonMatchesCounter = 0; 

        for(Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() % 2 != 0){
                nonMatchesCounter++;
            }         
        }
        return nonMatchesCounter;      
    }

}

