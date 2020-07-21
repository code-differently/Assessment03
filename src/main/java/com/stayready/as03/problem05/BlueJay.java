package com.stayready.as03.problem05;

public class BlueJay extends Bird{

    @Override
    public int getSpeed() {
        return 13;
    }

    @Override
    public String color() {
        String string = "";
        string = "blue";
        return string;
    }
}
