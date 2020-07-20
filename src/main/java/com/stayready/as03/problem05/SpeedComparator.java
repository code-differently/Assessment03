package com.stayready.as03.problem05;

import java.util.Comparator;

public class SpeedComparator implements Comparator<Animal>
{
    public int compare(Animal animal01, Animal animal02)
    {
        if(animal01.getSpeed() > animal02.getSpeed())
        {
            return -1;
        }
        else if(animal01.getSpeed() < animal02.getSpeed())
        {
            return 1;
        }

        return 0;
    }
}
