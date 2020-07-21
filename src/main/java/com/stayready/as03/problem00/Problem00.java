package com.stayready.as03.problem00;

import java.util.LinkedHashMap;
import java.util.Map;

public class Problem00 {
    public String countUniqueWords(String input){
        int count = 0;
        String[] strArr = input.split("\\s+");
        Map<String,Integer> uniqueMap = new LinkedHashMap<String, Integer>();

        for(int i = 0; i<strArr.length; i++){
            for(int j=1; j<strArr.length;j++){
                if(strArr[i].equals(strArr[j])){
                    strArr[j] = "0";
                    count++;
                }
            }
            if(uniqueMap.containsKey(strArr[i]))
                //uniqueMap.put(strArr[i], "Unique");
                count++;

        }

        return uniqueMap.toString();
    }
}
