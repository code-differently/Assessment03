package com.stayready.as03.problem01;

public class Problem01 {

    public String isThisWeird(int input) {
        if (input % 2 == 1) {
            return "Weird";
        } else {
            if (input <= 5 && input >= 2) {
                return "Not Weird";
            }
            if (input <= 20 && input >= 6) {
                return "Weird";
            } else {
                return "Not Weird";
            }
        }
    }
}