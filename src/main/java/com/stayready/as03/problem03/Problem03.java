package com.stayready.as03.problem03;

public class Problem03
{
    public String isPalindrome(String input)
    {
        int[] arr = new int[256];

        for(int i = 0; i < input.length(); i++)
        {
            arr[input.charAt(i)]++;
        }

        int odd = 0;
        int even = 0;

        //count the frequencies of each character
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] % 2 == 0)
                even++;
            else
                odd++;
        }

        //if there is more than one odd value, then it won't match up, leaving us to return false
        boolean result = true;
        if(odd > 1)
            result = false;

        return result ? "YES" : "NO";
    }
}
