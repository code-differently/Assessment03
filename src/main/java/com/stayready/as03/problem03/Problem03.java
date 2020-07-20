package com.stayready.as03.problem03;

import java.util.ArrayList;

public class Problem03 {
    public String isPalindrome(String input){
        StringBuilder builder=new StringBuilder();
        String word=builder.append(input).reverse().toString();
        if(word.equalsIgnoreCase(input))
            return "YES";
        else{
            boolean isFound=false;
            String[] split=input.split("");
            for (int i = 0; i <split.length; i++) {
                String currentWord=split[i];
                if(currentWord!=null) {
                    for (int j = 0; j < split.length; j++) {
                        if (j == i)
                            continue;
                        else if (currentWord.equals(split[j])) {
                            isFound = true;
                            split[j]=null;
                            split[i]=null;
                            break;
                        }
                    }
                    if(isFound==false)
                        return "NO";
                }
            }
        }
        return "YES";
    }
}
