package com.stayready.as03.problem05;

import java.util.Comparator;

public class SpeedComparator implements Comparator<Animal>{


    @Override
    public int compare(Animal obj, Animal other) {

        if (obj.getSpeed() >= other.getSpeed())
        {
           return -1;
        }
        else if (obj.getSpeed() == other.getSpeed())
        {
            return 0;
        }
        else {
            return 1;
        }
    }
}
