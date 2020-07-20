package com.stayready.as03.problem05;

public class Horse implements Animal {
    @Override
    public String move() {
        return "gallop";
    }

    @Override
    public String color() {
        return "brown";
    }

    @Override
    public int getSpeed() {
        return 40;
    }
}
