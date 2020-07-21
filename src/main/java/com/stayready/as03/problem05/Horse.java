package com.stayready.as03.problem05;

public class Horse implements Animal{

    @Override
    public String move() {
        String string = "";
        string = "gallop";
        return string;
    }

    @Override
    public int getSpeed() {
        return 40;
    }

    @Override
    public String color() {
        String string = "";
        string = "brown";
        return string;
    }
}
