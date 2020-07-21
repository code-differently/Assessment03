package com.stayready.as03.problem03;

import java.util.Arrays;

public class Problem03 {
    public String isPalindrome(String input){
        int NO_OF_CHARS = 256;
        int count[] = new int [NO_OF_CHARS];
        Arrays.fill(count, 0);

        for(int i=0; i<input.length(); i++){
            count[(int)(input.charAt(i))]++;
            int odd=0;
            for(int j=0; j<NO_OF_CHARS; j++){
                if((count[i]&1)==1){
                    odd++;
                    return "NO";
                }

                else if(odd>1){
                    return "NO"; 
                }
            }
        }
        return "YES"; 
    }
}
