package com.stayready.as03.problem05;

import java.util.Comparator;

public class SpeedComparator implements Comparator<Animal> {
    @Override
    public int compare(Animal a1, Animal a2) {
        if (a1.getSpeed() == a2.getSpeed()) {
            return 0;
        } else if (a1.getSpeed() > a2.getSpeed()) {
            return -1;
        } else {
            return 1;
        }
    }
}
