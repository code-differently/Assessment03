package com.stayready.as03.problem05;

import java.util.Comparator;

public class SpeedComparator implements Comparator<Animal> {
    @Override
    public int compare(Animal o1, Animal o2) {
        if(o1.getSpeed() > o2.getSpeed())
            return -1;
        if(o1.getSpeed() < o2.getSpeed())
            return 1;


        return 0;
    }
}
