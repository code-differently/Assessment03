package com.stayready.as03.problem04;

import java.util.HashMap;

public class Problem04 {
    public Boolean harmlessRansomNote(String message , String magazineText){
        HashMap<String, Integer> map = new HashMap<>();
        for (String s : magazineText.split(" ")) {
            if (map.containsKey(s)) {
                map.put(s, map.get(s) + 1);
            } else {
                map.put(s, 1);
            }
        }
        for (String s: message.split(" ")) {
            if (map.containsKey(s)) {
                map.put(s, map.get(s) - 1);
            }
            if (map.get(s) < 0) {
                return false;
            }
        }
        return true;
    }
}
