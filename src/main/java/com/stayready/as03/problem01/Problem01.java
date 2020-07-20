package com.stayready.as03.problem01;

public class Problem01 {

    public String isThisWeird(int input){

        if(input % 2 == 1 || (input%2 ==0 && 6 <= input && input <= 20)){

            return "Weird";
        }

        return "Not Weird";
    }
}
