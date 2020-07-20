package com.stayready.as03.problem01;

public class Problem01 {

    public String isThisWeird(int input){
        String output = "";
        if(input % 2 != 0){
            output = "Weird";
        }
        else if((input % 2 == 0) && input >= 2 && input <= 5){
            output = "Not Weird";
        }
        else if((input % 2 == 0) && input >= 6 && input <= 20){
            output = "Weird";
        }
        else if((input % 2 == 0) && input > 20){
            output = "Not Weird";
        }
        return output;
    }
}
