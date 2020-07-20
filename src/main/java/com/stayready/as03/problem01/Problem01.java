package com.stayready.as03.problem01;

public class Problem01{

    public String isThisWeird(int input){
        if (input % 2 == 0 && input <= 5)
            return "Not Weird";

        if (input % 2 == 0 && input > 20)
            return "Not Weird";

        if (input % 2 == 0 && input <= 20)
            return "Weird";

        if (input % 2 != 0)
            return "Weird";

     else
        return "Weird";


}
}
