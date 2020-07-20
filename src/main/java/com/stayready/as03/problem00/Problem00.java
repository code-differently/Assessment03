package com.stayready.as03.problem00;

public class Problem00 {
    public String countUniqueWords(String input){
        String string = "that that is that that is not is not is that it it is wutang";
        String word = "that";
        String temp[] = string.split(" ");
        int count = 0;
        for(int i = 0; i < temp.length; i++){
            if (word.equals(temp[i]))
            count++;
        }
        return Integer.toString(count);
    }
}
