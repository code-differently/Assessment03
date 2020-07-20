package com.stayready.as03.problem03;

import java.util.ArrayList;

public class Problem03 
{
    public String isPalindrome(String input)
    {
    ArrayList <Character> palinList = new ArrayList<Character>();
    
    for (int i = 0; i < input.length();i++)
    {
        if(palinList.contains(input.charAt(i)))
        {
            palinList.remove((Character)input.charAt(i));
        }
        else
        {
            palinList.add(input.charAt(i));
        }
    }

    if (input.length() % 2 == 0 && palinList.isEmpty() || (input.length() % 2 == 1 && palinList.size() == 1))
    {
        return "YES"; 
    }
    else
    {
      return "NO";  
    }
 
    }
}
