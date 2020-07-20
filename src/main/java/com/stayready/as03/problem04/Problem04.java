package com.stayready.as03.problem04;
import java.util.*;
import java.util.HashMap;


public class Problem04 {
    public Boolean harmlessRansomNote(String message , String magazineText){   
        
    

    String[]str = magazineText.split("");
    //create a hashmap to take an integer vaalue and string key
    //
    HashMap<String, Integer> comparison = new HashMap<String, Integer>();
    
    //iterate through the array
    for (String i: str ){
        comparison.put(i,comparison.get(i)==null?1:comparison.get(i)+1);
    }
        String[] Arr2 = message.split(" ");
        for(String i : Arr2)
        {   //check and compare the words
            if(!comparison.containsKey(i)){

               return false;
            }
        
            int count = comparison.get(i) - 1;
          
            //
              if(count == 0) {

                comparison.remove(i);
                return false;
            }

            //if not
            else
            {
                
                comparison.put(i, count);
            }
        }

        return true;
    
    

}

}

