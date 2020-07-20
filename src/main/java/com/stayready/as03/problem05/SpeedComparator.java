package com.stayready.as03.problem05;

import java.util.Comparator;

public class SpeedComparator implements Comparator<Animal> {
    @Override
    public int compare(Animal animal1, Animal animal2) {
        return animal2.getSpeed() - animal1.getSpeed();
    }
}
