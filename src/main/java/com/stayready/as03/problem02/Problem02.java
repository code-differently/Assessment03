package com.stayready.as03.problem02;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Problem02 {

    public int findNumberOfNonMatching(int[] ar) {
        ArrayList<Integer> list = new ArrayList<> ();
        Integer output =0;
        Arrays.sort(ar);
        for(Integer i =0 ;i<ar.length-1; i++ ){
            if( i<ar.length-1 && ar[i]==ar[i+1]){
                list.add(ar[i]);
                i=i+1;
            }

        }

        output= ar.length-(list.size()*2);

        return output;
    }

}

