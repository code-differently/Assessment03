package com.stayready.as03.problem05;

import java.util.Comparator;

public class SpeedComparator implements Comparator<Animal> {

    @Override
    public int compare(Animal o1, Animal o2) {
        int out = 0;
        if(o1.getSpeed() == o2.getSpeed()){
            return 0;
        }
        else if(o1.getSpeed() > o2.getSpeed()){
            out = -1;
        }
        else if(o1.getSpeed() < o2.getSpeed()){
            out = 1;
        }
        return out;
    }
}
