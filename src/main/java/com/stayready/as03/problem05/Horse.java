package com.stayready.as03.problem05;

public class Horse implements Animal{

    private String move;
    private String color;
    private int speed;
    public Horse(){

        this.move = "gallop";
        this.color = "brown";
        this.speed = 40;
    }


    public String move() {
        return this.move;
    }

    public int getSpeed() {
        return this.speed;
    }

    public String color() {
        return this.color;
    }
}
