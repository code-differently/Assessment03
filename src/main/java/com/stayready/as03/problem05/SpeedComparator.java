package com.stayready.as03.problem05;

import java.util.Comparator;

public class SpeedComparator implements Comparator<Animal>{
    public int compare(Animal animal1, Animal animal2)
    {
        int difference = 0;
        if(animal1.getSpeed() == animal1.getSpeed())
        {
            difference = 0;   
        }
        if(animal1.getSpeed() < animal1.getSpeed())
        {
            difference = 1;
        }
        else
        {
            difference = -1;
        }
        return difference;
    }
}
