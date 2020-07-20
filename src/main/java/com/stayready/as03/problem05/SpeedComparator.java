package com.stayready.as03.problem05;

import java.util.Comparator;

public class SpeedComparator implements Comparator<Animal> {
    @Override
    public int compare(Animal animal01, Animal animal02) {
        int verdict = 0;
        if (animal01.getSpeed() == animal02.getSpeed()) {
            verdict = 0 ;
        } else if (animal01.getSpeed() > animal02.getSpeed()) {
            verdict = -1;
        } else if (animal01.getSpeed() < animal02.getSpeed()) {
            verdict = 1;
        }
        return verdict;
    }
}


