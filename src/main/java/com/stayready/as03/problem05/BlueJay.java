package com.stayready.as03.problem05;

public class BlueJay extends Bird implements Animal
{
    @Override
    public int getSpeed() {
        return 13;
    }

    public String color()
    {
        return "blue";
    }

}
