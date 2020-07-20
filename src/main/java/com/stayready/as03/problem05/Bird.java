package com.stayready.as03.problem05;

public abstract class Bird implements Animal {



    private String move;
    private String color;
    private int speed;
    private String migMonth;

    public Bird(String color, int speed){

        this.move = "fly";
        this.color = color;
        this.speed = speed;
    }

    public int getSpeed() {

        return this.speed;
    }

    public String color() {

        return this.color;
    }

    public String move() {

        return this.move;
    }

    public void setMigrationMonth(String expected) {

        this.migMonth = expected;
    }

    public String getMigrationMonth() {

        return this.migMonth;
    }
}
