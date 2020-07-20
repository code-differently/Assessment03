package com.stayready.as03.problem04;

public class Problem04 {
    public Boolean harmlessRansomNote(String message , String magazineText){
        if (magazineText.matches(message)) {
            return true;
        }
        else{
            if (magazineText.length() % message.length() != 0){
                return false;
            }
        }
        return false;
    }
}
