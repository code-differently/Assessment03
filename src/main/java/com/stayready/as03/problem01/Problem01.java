package com.stayready.as03.problem01;

public class Problem01 {

    public String isThisWeird(int input){
        String one = "Weird";
        String two = "Not Weird";
        if(input % 2 != 0){
            return one;
        } else if ((input >= 2 && input <= 5) && input % 2 == 0){
            return two;
        } else if ((input >= 6 && input <= 20) && input % 2 == 0){
            return one; 
        } else if (input % 2 == 0 && input > 20){
            return two;
        }
        return null;
    }
}
