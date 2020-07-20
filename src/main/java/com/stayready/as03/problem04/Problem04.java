package com.stayready.as03.problem04;

public class Problem04 {
    public Boolean harmlessRansomNote(String message , String magazineText){
        String[] split=message.split(" ");
        String[] magSplit=message.split(" ");
        boolean result=true;
        for (int i = 0; i <split.length ; i++) {
            String currentWord=split[i];
            boolean found=false;
            for (int j = 0; j <magSplit.length ; j++) {
                if(magSplit[j]==currentWord){
                    magSplit[j]="REMOVED";
                    found=true;
                    j=magSplit.length;
                }
            }
            if(found==false)
                result=false;
        }
        return result;
    }
}
