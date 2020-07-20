package com.stayready.as03.problem01;

public class Problem01 {

    public String isThisWeird(int input)
    {
        String weird = "Weird";
        String notweird = "Not Weird";

        if(input % 2 != 0)
        {
            return weird;
        }
        else if(input >= 2 && input <=5)
        {
            return notweird;
        }
        else if(input >= 6 && input <= 20)
        {
            return weird;
        }
        else if(input > 20)
        {
            return notweird;
        }
        
        return null;
    }
}
