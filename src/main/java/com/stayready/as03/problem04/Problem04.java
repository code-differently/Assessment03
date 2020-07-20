package com.stayready.as03.problem04;

import java.util.HashMap;

public class Problem04 {
    public Boolean harmlessRansomNote(String message , String magazineText){

        HashMap<String, Integer> messageMap = new HashMap<>();
        HashMap<String, Integer> magazineMap = new HashMap<>();

        String[] messageArray = message.split(" ");
        String[] magazineArray = magazineText.split(" ");

        for (int i = 0; i < messageArray.length; i++) {
            messageMap.put(messageArray[i], messageMap.getOrDefault(messageArray[i], 0) + 1);
        }

        for (int i = 0; i < magazineArray.length; i++) {
            magazineMap.put(magazineArray[i], magazineMap.getOrDefault(magazineArray[i], 0) + 1);
        }

        for (int i = 0; i < messageArray.length; i++) {
            if (messageMap.containsKey(messageArray[i]) && magazineMap.containsKey(messageArray[i])) {
                if (messageMap.get(messageArray[i]) > magazineMap.get(messageArray[i]))
                    return false;
                messageMap.remove(messageArray[i]);
                magazineMap.remove(messageArray[i]);
            }
        }

        return true;
    }
}
