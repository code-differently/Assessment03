package com.stayready.as03.problem04;

import java.lang.reflect.Array;
import java.util.HashMap;

public class Problem04 {

    private String [] turnStringToArr(String input) {
        String [] arr = input.split(" ");
        return arr;
    }

    private HashMap<String, Integer> updateMap( HashMap<String, Integer> map, String input){
        if (input.equals("secret") ){

            map.put(input, map.get(input) + 1);
        }

        return map;
    }

    private HashMap<String, Integer> setMap (String [] arr) {

        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("secret", 1);
        for(int i = 0; i < arr.length; i++) {

            updateMap(map, arr[i]);
        }

        return map;
    }

    private boolean rightNumOfSec(HashMap<String, Integer> map, HashMap<String, Integer> map1){

        if(map.get("secret") > map1.get("secret")){

            return false;
        }

       return true;
    }

    public Boolean harmlessRansomNote(String message , String magazineText){

        message.toLowerCase();
        magazineText.toLowerCase();
        String [] sentMsg = turnStringToArr(message);
        String [] mag = turnStringToArr(magazineText);
        HashMap<String, Integer> msgMap = setMap(sentMsg);
        HashMap<String, Integer> magMap = setMap(mag);

        return rightNumOfSec(msgMap, magMap);
    }
}
