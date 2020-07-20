package com.stayready.as03.problem02;

import java.util.*;


public class Problem02 {

    public int findNumberOfNonMatching(int[] ar) {
       // create a new hashmap <String,Integer> ps: must be of Integer type* 
     HashMap<Integer, Integer> numberOfOddSocks = new HashMap<Integer,Integer>(); 
  
     //iterate through the array using a forloop.
        for(int i: ar ){
     //assign each unique element to a key in the hashmap
               if(numberOfOddSocks.containsKey(i)){
    //check to see if each unique element repeats itself
    // if repeated add 1.
    numberOfOddSocks.put(i , numberOfOddSocks.get(i)+1);
               
    //             // if new , equate it to 1
               }
           else{
                 numberOfOddSocks.put(i,1);
         }
       }
    //     //done with for loop; hash map has correct keys and values.
    
     //check if value is even
     //find the pairs by dividing the values by two.add to counter
     int counter=0;
    for(Integer i : numberOfOddSocks.keySet()){
        if(numberOfOddSocks.get(i)%2 ==0){
             int result = numberOfOddSocks.get(i) /2;
              counter+=result;
        }
         else {//if (numberOfCounts.get(i)>1 && numberOfCounts.get(i)% 2 == 0){
             int result = (numberOfOddSocks.get(i)-1) /2;
             counter+= result;

        }
     }
       return counter;
     }
  
     

}

