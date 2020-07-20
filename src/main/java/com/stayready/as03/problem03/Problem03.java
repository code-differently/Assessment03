package com.stayready.as03.problem03;

public class Problem03 {
    static int numOfChars = 256;

    public String isPalindrome(String input){
        String value = "YES";
        int count[] = new int[numOfChars];
        for(int i = 0; i<input.length(); i++)
        {
            count[(int) input.charAt(i)]++;
        }
        int odd = 0;
        for(int j= 0;j< numOfChars; j++)
        {
            if ((count[j] & 1) ==1)
            {
                odd++;
            }
            if(odd> 1)
            {
                value = "NO";
            }
        }
        return value;
    }
}
