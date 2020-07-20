package com.stayready.as03.problem01;

public class Problem01 {

    public String isThisWeird(int input){

        String result;

        if(input % 2 == 0)
            result = "Not Weird";
        else
            result = "Weird";

        return result;
    }
}
