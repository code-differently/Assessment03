package com.stayready.as03.problem05;

public class Horse implements Animal{
    
    public String move(){
        return "gallop";
    }

    public int getSpeed(){
        return 40;
    }

    public String color(){
        return "brown";
    }
}
