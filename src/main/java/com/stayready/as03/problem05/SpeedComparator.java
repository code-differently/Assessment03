package com.stayready.as03.problem05;

import java.util.Comparator;

public class SpeedComparator implements Comparator<Animal>{

    @Override
    public int compare(Animal o1, Animal o2) {
        // TODO Auto-generated method stub
        return o2.getSpeed() - o1.getSpeed();
    }
}
