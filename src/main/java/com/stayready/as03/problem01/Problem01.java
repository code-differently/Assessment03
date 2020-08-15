package com.stayready.as03.problem01;

public class Problem01 {

    public String isThisWeird(int input){
        String answer = "";

        if(isOdd(input)) {
            answer = "Weird";
        }
        else if(isEven(input) && inRange(2, input, 5)) {
            answer = "Not Weird";
        }
        else if(isEven(input) && inRange(6, input, 20)) {
            answer = "Weird";;
        }
        else if(isEven(input) && input > 20) {
            answer = "Not Weird";
        }
        return answer;
    }

    private boolean isEven(int val) {
        return val % 2 == 0;
    }

    private boolean isOdd(int val) {
        return val % 2 == 1;
    }

    private boolean inRange(int lowerBound, int val, int upperBound) {
        return (val >= lowerBound) && (val <= upperBound);
    }
}
