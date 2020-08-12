package com.stayready.as03.problem01;

public class Problem01 {

    public static String isWeird_v1(int input){
        String result = "";
        if (input % 2 == 1) {
            result =  "Weird";
        } else if (input % 2 == 0 && input >= 2 && input <= 5) {
            result =  "Not Weird";
        } else if (input % 2 == 0 && input >= 6 && input <= 20) {
            result = "Weird";
        } else if (input % 2 == 0 && input > 20){
            result = "Not Weird";
        }
        return result;
    }

    public static String isWeird_v2(int input){
        switch (input % 2){
            case 0:
                return input >= 6 && input <= 20 ? "Weird" : "Not Weird";
            default:
                return "Weird";
        }
    }
}
