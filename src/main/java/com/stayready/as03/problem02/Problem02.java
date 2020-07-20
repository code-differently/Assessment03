package com.stayready.as03.problem02;

import java.util.ArrayList;
import java.util.HashMap;

public class Problem02 {

    private HashMap<Integer,Integer> updateMap(HashMap<Integer,Integer> map, Integer n){

        if(!map.containsKey(n)) {

            map.put(n, 1);
        } else {

            map.put(n, map.get(n) + 1);
        }

        return map;
    }

    private int numberOfNonPairs(HashMap<Integer,Integer> map, int[] ar1 ){

        int count = 0;
        for (Integer key : map.keySet()) {
            Integer value = map.get(key);
            if(value % 2 != 0){

                count++;
            }
        }
        return count;
    }


    public int findNumberOfNonMatching(int[] ar) {

        int count = 0;
        HashMap<Integer,Integer> temp = new HashMap<Integer,Integer>();
        for(int i = 0; i < ar.length; i++) {
           temp = updateMap(temp, ar[i]);
        }


        return numberOfNonPairs(temp, ar);
    }





}

