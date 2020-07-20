package com.stayready.as03.problem02;


import java.util.HashMap;

public class Problem02 {

    public int findNumberOfNonMatching(int[] ar) {
        int counter=0;
        HashMap<Integer,Integer> socks=new HashMap<Integer, Integer>();
        for (Integer num :
            ar) {
            if (socks.get(num) == null && num>=0 && num <=100) {
                socks.put(num, 1);
            }
            else {
                int temp=socks.get(num) +1;
                socks.replace(num,temp);
            }
        }
        for (int value :
            socks.keySet()) {
            if(socks.get(value)%2==1)
                counter++;

        }
        return counter;
    }

}

