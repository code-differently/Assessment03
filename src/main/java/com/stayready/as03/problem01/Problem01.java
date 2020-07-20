package com.stayready.as03.problem01;

public class Problem01 {

    public String isThisWeird(int input){

        boolean even = input % 2 == 0;
        String output = "";

        if (input % 2 == 1)
        {
            output = "Weird";
        }
        if (even && (input >= 2 && input <= 5))
        {
            output =  "Not Weird";
        }
        if ((even && (input >= 6 && input <= 20)) || (even && (input >= 6 && input <= 20)))
        {
            output = "Weird";
        }
        if (even && input >= 20)
        {
            output =  "Not Weird";
        }

        return output;
    }
}
