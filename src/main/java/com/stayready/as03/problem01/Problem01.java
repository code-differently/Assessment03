package com.stayready.as03.problem01;

public class Problem01 {

    public String isThisWeird(int input){

        String answer = "";

        if (input % 2 == 1)
            answer = "Weird";

        else if (input % 2 == 0 && input >= 2 && input <= 5)
            answer = "Not Weird";

        else if (input % 2 == 0 && input >= 6 && input <= 20)
            answer = "Weird";

        else
            answer = "Not Weird";

        return answer;
    }
}
