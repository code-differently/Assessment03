package com.stayready.as03.problem01;

public class Problem01 {

    public String isThisWeird(int input){
        for(int i = 0; i < input; i++ ) {
            if(input % 2 == 0) {
                if(input >= 2 && input <= 5){
                    if(input >= 6 && input <= 20){
                        if(input >= 21) {
                            return "Not Weird";
                        } 
                        return "Weird";
                    }
                    return "Not Weird";
                    }
               return "Not Weird";
            } 
            else if(input % 2 == 1 ) {
                return "Weird";
            }
        }
        return null;
    }
}
