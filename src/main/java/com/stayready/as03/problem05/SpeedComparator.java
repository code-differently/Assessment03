package com.stayready.as03.problem05;

import java.util.Comparator;

public class SpeedComparator implements Comparator<Animal> {
    public int compare(Animal animal1, Animal animal2){
        if(animal1.getSpeed() == animal2.getSpeed()){
            return 0;
        }else if (animal1.getSpeed() > animal2.getSpeed()){
            return -1;
        }else
            return 9;
    }
}
