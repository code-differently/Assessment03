package com.stayready.as03.problem04;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Problem04 {
    public Boolean harmlessRansomNote(String message , String magazineText){
        ArrayList<String> note = new ArrayList<String>();
        ArrayList<String> zine = new ArrayList<String>();

        String[] messageRay = message.split(" ");
        String[] magazineRay = magazineText.split(" ");

        for(String word : messageRay){
            note.add(word);
        }
        for(String word : magazineRay){
            zine.add(word);
        }

        for(String word : note){
            if(zine.contains(word)){
                zine.remove(word);
            }
            else{
                return false;
            }
        }
        

        return true;
    }
}
