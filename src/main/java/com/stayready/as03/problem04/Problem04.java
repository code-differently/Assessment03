package com.stayready.as03.problem04;

import java.util.ArrayList;

public class Problem04 {
    public Boolean harmlessRansomNote(String message , String magazineText){
        ArrayList<String> messageArray = new ArrayList<String>();
        messageArray.add(message);
        ArrayList<String> magazineTextArray = new ArrayList<String>();
        magazineTextArray.add(magazineText);
        for(String messageElements : messageArray){
            for(String magazineElements: magazineTextArray){
                if(messageElements.equals(magazineElements)){
                    return true;
                }
            }
        }return false;
    }
}
