package com.stayready.as03.problem01;

public class Problem01 {

    public String isThisWeird(int input){
        String nonWeird = "Not Weird";
        String defWeird = "Weird";
        /* If  is odd, print Weird
         * If  is even and in the inclusive range of 2 to 5 , print Not Weird
         * If  is even and in the inclusive range of 6 to 20 , print Weird
         * If  is even and greater than 20 , print Not Weird*/
        if(input%2==1){
            return defWeird;
        } else if (input%2==0 && 2<=input && input<=5){
            return nonWeird;
        } else if (input%2==0 && 6<=input && input<=20){
            return defWeird;
        }else if (input%2==0 && input>20){}
            return nonWeird;
    }
}
