package com.stayready.as03.problem01;

public class Problem01 {

    public String isThisWeird(int input){
        if(input%2==1)
            return "Weird";
        else if(input%2==0 && input>=2 && input<=5)
            return "Not Weird";
        else if(input%2==0 && input>=6 && input<=20)
            return "Not Weird";
        else if(input%2==0 && input>20)
            return "Not Weird";
        return "";

    }
}
