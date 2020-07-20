package com.stayready.as03.problem05;

public class BlueJay extends Bird{
    public String color(){
        return "blue";
    }
    public int speed(){
        return 13;
    }

    @Override
    public int getSpeed() {
        // TODO Auto-generated method stub
        return speed();
    }
}
