package com.stayready.as03.problem00;
// import java.io.*;
// import java.math.*;
// import java.security.*;
// import java.text.*;
// import java.util.*;
// import java.util.concurrent.*;
// import java.util.regex.*;

public class Problem00 {
    public String countUniqueWords(String input) {
  
        String[] sentence = input.split(" ");
        boolean[] array = new boolean[sentence.length];
        int i, j = 0;
        Integer count = 0;
        String str1 = Integer.toString(count);
        for (i = 0; i < sentence.length; i++) {
            if (!array[i]) {
                count++;
                for (j = i + 1; j < sentence.length; j++) {
                    if (sentence[j].compareTo(sentence[i]) == 0) {
                        array[j] = true;
                        count--;
                    }
                }
            }
        }

        return str1;
    
    }
     
        
         
   }

    
    
    

