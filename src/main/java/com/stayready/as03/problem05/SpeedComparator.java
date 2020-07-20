package com.stayready.as03.problem05;

import java.util.Comparator;

public class SpeedComparator implements Comparator<Animal> {

    public int compare(Animal animal1, Animal animal2) {
        if(animal1.getSpeed() > animal2.getSpeed())
            return -1;
        if(animal1.getSpeed() < animal2.getSpeed())
            return 1;

        return 0;
    }
}
