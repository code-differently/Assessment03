package com.stayready.as03.problem03;

import java.util.Arrays;

public class Problem03 {
    public String isPalindrome(String input) {

        char[] ar = input.toCharArray();


        Arrays.sort(ar);

        int count = 0;

        //count how many lone pairs of chars

        for (int i = 0; i < ar.length - 1; i++) {
            if (ar[i] == ar[i + 1]) {
                i ++ ;
            }else{
                count++;
            }
        }

        if(count == 0 || (count ==1 && input.length()%2 ==1)){ 
            //If no lone pairs or only one for odd string
            return "YES";
        }
        else{
            return "NO";
        }
        

        

    }
}
