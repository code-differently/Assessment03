package com.stayready.as03.problem04;

public class Problem04 {
    public Boolean harmlessRansomNote(String message , String magazineText){
        
        String[] messageArray = message.split(" ");
        String[] magazineTestArray = magazineText.split(" ");

        for(String word: messageArray){
            int occ = 0;
            for(String text: magazineTestArray){
                if(word.equals(text))
                    occ++;

                if(occ < 2)
                    return true;
            }
        }
        
        return false;
    }
}
