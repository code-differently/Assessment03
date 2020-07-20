package com.stayready.as03.problem04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Problem04 {
    public Boolean harmlessRansomNote(String message , String magazineText){
        String[] sntnc = message.split(" ");
        // make magazineText into arrayList
        List<String> magText = Arrays.asList(magazineText.split(" "));

//        Iterator<String> iter = magText.iterator();
//        if (iter.hasNext()) {
//            if (!magText.contains(iter.next())) {
//                return false;
//            } else {
//                magText.remove(iter.next());
//            }
//        }

        // iter thu sntnc
        for (int idx =  0; idx < sntnc.length; idx++) {
            if (!magText.contains(sntnc[idx])){ // if the magText doesnt contain the curr word in sntnc
                return false; // set canReplicate false, because it isnt in the magazine
            } else { // if magText does contain
                magText.remove(sntnc[idx]);
            }
        }
        return true;
    }
}
