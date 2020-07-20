package com.stayready.as03.problem04;


import java.util.Hashtable;

public class Problem04 {
    public Boolean harmlessRansomNote(String message , String magazineText) {
        Hashtable<String, Integer> magazineHash = new Hashtable<String, Integer>();
        boolean works = true;

        for(String letters: magazineText.split(" ")) {
            Integer total = magazineHash.get(letters);
            if(total != null) {
                magazineHash.put(letters, total +1) ;
            } else {
                magazineHash.put(letters, 1) ;
            }
        }

        for(String letters: message.split(" ")) {
            Integer total = magazineHash.get(letters);

            if(total == null || total == 0) {
                works = false;
                break;
            } else {
                magazineHash.put(letters, total-1);
            }
        }

        return works;
    }
}