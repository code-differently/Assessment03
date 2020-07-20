package com.stayready.as03.problem03;

import java.util.HashMap;

public class Problem03 {
    public String isPalindrome(String input)
    {
        HashMap<Character, Integer> palindrome = new HashMap<>();

        for(int i = 0; i < input.length(); i++)
        {
            char word = input.charAt(i);

            if(!palindrome.containsKey(word))
            {
                palindrome.put(word, 1);
            }
            else
            {
                palindrome.replace(word, palindrome.get(word) + 1);
            }
        }

        int x = 0;

        for(HashMap.Entry<Character, Integer> occur : palindrome.entrySet())
        {
            if(occur.getValue() % 2 != 0 && x > 0)
            {
                return "NO";
            }
            else if(occur.getValue() % 2 != 0)
            {
                x++;
            }
        }
        
        return "YES";
    }
}