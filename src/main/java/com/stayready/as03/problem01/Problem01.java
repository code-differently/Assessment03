package com.stayready.as03.problem01;

public class Problem01 {

    public String isThisWeird(int input) {
        if (!isEven(input)) {
            return "Weird";
        } else if (isEven(input) && inRange(2, 5, input)) {
            return "Not Weird";
        } else if (isEven(input) && inRange(6, 20, input)) {
            return "Weird";
        } else if (isEven(input) && input > 20) {
            return "Not Weird";
        } else {
            return null;
        }
    }

    public boolean inRange(int a, int b, int c) {
        if (c >= a && c <= b) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEven(int a) {
        if (a % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
