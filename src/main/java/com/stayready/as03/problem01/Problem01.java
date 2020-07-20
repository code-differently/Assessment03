package com.stayready.as03.problem01;

public class Problem01 {

    private String isOdd() {

        return "Weird";
    }

    private String isEven( Integer n) {

        if(n >= 6 && n <= 20 ) {

            return "Weird";

        } else {

            return "Not Weird";
        }

    }


    public String isThisWeird(int input){

        if (input % 2 != 0) {
            return isOdd();
        } else {

            return isEven(input);
        }

    }
}
