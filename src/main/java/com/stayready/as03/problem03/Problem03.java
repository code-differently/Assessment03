package com.stayready.as03.problem03;

import java.util.ArrayList;

public class Problem03 {
    public String isPalindrome(String input){
        ArrayList<Character> list= new ArrayList<>();
        String output= "";
        char[] chars= input.toCharArray();
        for(int i=0; i<chars.length; i++){
            if(list.contains(chars[i])){
                list.remove((Character) input.charAt(i));
            }
            else {
                list.add(input.charAt(i));
            }
        }
        if((input.length()%2==0) || (input.length() %2 ==1 && list.size()==1)){
           output="YES";
        }
        else{
            output="NO";
        }
        return output;


    }
}
