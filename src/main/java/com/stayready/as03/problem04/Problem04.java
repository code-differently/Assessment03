package com.stayready.as03.problem04;

import java.util.HashSet;

public class Problem04 {
    public Boolean harmlessRansomNote(String message , String magazineText){
        String[] split=message.split(" ");
        String[] magSplit=magazineText.split(" ");

        for (int i = 0; i <split.length ; i++) {
            String currentWord=split[i];
            boolean found=false;
            for (int j = 0; j <magSplit.length ; j++) {
                if(magSplit[j].equals(currentWord) && !found){
                    magSplit[j]="";
                    found=true;
                }
            }
            if(!found)
                return false;
        }
        return true;
    }
}
