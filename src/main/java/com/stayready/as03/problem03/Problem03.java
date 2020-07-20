package com.stayready.as03.problem03;

public class Problem03 {
    public String isPalindrome(String input){
        int[] namOfOccurrences = new int[26];
        for(int i = 0; i < input.length(); i++)
        {
            namOfOccurrences[input.charAt(i) - 'a']++;
        }
        boolean singleFound = false;
        String verdict = "YES";
        for(int i = 0; i < 26; i++)
        {
            if(namOfOccurrences[i] % 2 != 0)
            {
                if(singleFound)
                {
                    verdict = "NO";
                    return verdict;
                }
                else
                    singleFound = true;
            }
        }
        return verdict;
    }
}
