package com.stayready.as03.problem05;

public class RedRobin extends Bird
{
    private String migrationMonth;

    public String color()
    {
        return "red";
    }

    public int getSpeed()
    {
        int speed = 10;

        return speed;
    }

    public String getMigrationMonth()
    {
        return migrationMonth;
    }

    public void setMigrationMonth(String mm)
    {
        migrationMonth = mm;
    }
}
