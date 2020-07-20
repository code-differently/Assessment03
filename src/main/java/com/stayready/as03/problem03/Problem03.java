package com.stayready.as03.problem03;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Problem03 {
    public String isPalindrome(String input) {
        int[] alpha = new int[26];
        for (int j = 0; j < input.length(); j++) {
            alpha[input.charAt(j) - 'a']++;
        }
        boolean letter = false;
        String answer = "YES";
        for (int i = 0; i < 26; i++) {
            if (alpha[i] % 2 != 0) {
                if (letter) {
                    answer = "NO";
                    break;
                } else
                    letter = true;
            }
        }
        return answer;
    }
}
