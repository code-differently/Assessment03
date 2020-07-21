package com.stayready.as03.problem01;

public class Problem01 {

    public String isThisWeird(int input) {
        String string = "";
        if (input % 2 != 0){
            string = "Weird";
        }else if(input % 2 == 0 && input >=2 && input <= 5){
            string = "Not Weird";
        }else if(input % 2 == 0 && input >= 6 && input <=20){
            string = "Weird";
        }else{
            string = "Not Weird";
        }
        return string;
    }
}
