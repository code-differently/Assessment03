package com.stayready.as03.problem01;

public class Problem01 {

    // Given an integer, , perform the following conditional actions:    If is odd, print Weird
    // If is even and in the inclusive range of 2 to 5 , print Not Weird
    // If is even and in the inclusive range of 6 to 20 , print Weird
    // If is even and greater than 20 , print Not Weird Complete the stub code provided in your editor to print whether or not is weird.

    public String isThisWeird(int input){
       
            if (input % 2 == 0 && input>=2 && input<=5){

                return "Not Weird";
             }
                  else if(input % 2 == 0 && input >=6 && input<=20){
                  return "Not Weird";
            }
            else if (input % 2 == 0 && input>20){
                return "Not Weird";
            }

            else return "Weird";
        
        }
        
        }

