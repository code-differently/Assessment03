package com.stayready.as03.problem01;

public class Problem01 {

    public String isThisWeird(int input){
        String outPut = "";
        if(input%2 == 1)
        {
            outPut = "Weird";
        }
        else if(input %2 ==0 && (input >= 2 || input <= 5))
        {
            outPut= "Not Weird";
        }
        else if(input % 2 ==0 && (input >=6 || input <= 20))
        {
            outPut = "Weird";
        }
        else if(input % 2 ==0 &&(input>20))
        {
            outPut = "Weird";
        }

        return outPut;
    }
}
