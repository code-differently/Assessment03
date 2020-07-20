package com.stayready.as03.problem03;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class Problem03 {
    public String isPalindrome(String input) {

        int[] freq = new int[26];
        for (int i = 0; i < input.length(); i++) {
            freq[input.charAt(i) - 'a']++;
        }
        boolean singleFound = false;
        String result = "YES";
        for (int i = 0; i < 26; i++) {
            if (freq[i] % 2 != 0) {
                if (singleFound) {
                    result = "NO";
                    break;
                } else
                    singleFound = true;
            }
        }
        return result;
    }
}