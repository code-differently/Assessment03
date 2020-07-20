package com.stayready.as03.problem00;

import java.util.LinkedHashMap;
import java.util.Map;

public class Problem00 {
    public String countUniqueWords(String input){

        String[] strArr = input.split("\\s+");
        Map<String,String> uniqueMap = new LinkedHashMap<String, String>();

        for(int i = 0; i<strArr.length; i++){
            if(uniqueMap.containsKey(strArr[i]))
                uniqueMap.put(strArr[i], "Unique");

        }

        return uniqueMap.toString();
    }
}
