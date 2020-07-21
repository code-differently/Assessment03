package com.stayready.as03.problem01;

public class Problem01 {

    public String isThisWeird(int input){
        String output="";
        if(input%2!=0){
            output="Weird";
        }
        else{
            if(2<=input && input <=5){
                output="Not Weird";
            }
            else if(6<=input && input <=20){
                output="Weird";
            }
            else{
                output="Not Weird";
            }

        }
        return output;
    }
}
