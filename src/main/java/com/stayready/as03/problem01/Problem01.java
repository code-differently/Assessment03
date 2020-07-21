package com.stayready.as03.problem01;

public class Problem01 {

    public String isThisWeird(int input){

        String outcome;

        if(input % 2 == 0)
            outcome = "Not Weird";
        else
            outcome = "Weird";

         return outcome;

        }
    }

