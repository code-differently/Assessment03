package com.stayready.as03.problem03;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Problem03 {
    public String isPalindrome(String input){
        String output = "";
        ArrayList<String> chars = new ArrayList<>();

        for (int index = 0; index < input.length(); index++)
        {
            chars.add(input.charAt(index) + "");
        }

        HashMap<String, Integer> seen_history = new HashMap<>();

        for (int i = 0; i < chars.size(); i++)
        {
            if (!seen_history.containsKey(chars.get(i)))
            {
                seen_history.put(chars.get(i), 1);
            }
            else {
                seen_history.put(chars.get(i), seen_history.get(chars.get(i)) + 1);
            }
        }
        System.out.println(seen_history);
        int non_matching = 0;
        for (Map.Entry<String, Integer> entry: seen_history.entrySet())
        {
            if (entry.getValue() % 2 == 1)
            {
                non_matching++;
            }
        }

        //odd case
        if (input.length() % 2 == 1)
        {
            if (non_matching == 1)
            {
                output = "YES";
            } else {
                output = "NO";
            }
        }

        //even case
        if (input.length() % 2 == 0)
        {
            if (non_matching == 0)
            {
                output = "YES";
            } else {
                output = "NO";
            }
        }

        return output;
    }
/*
    public static void main(String[] args) {
        Problem03 test = new Problem03();
        System.out.println(test.isPalindrome("cdcdcdcdeeeef"));
    }*/
}
