package com.stayready.as03.problem05;

import java.util.Comparator;

public class SpeedComparator implements Comparator<Animal> {

    public int compare(Animal animal1, Animal animal2){
        int num = 0;

        if (animal1.getSpeed() == animal2.getSpeed()){
            num= 0;
        }

        else if(animal1.getSpeed() > animal2.getSpeed()){
            num=  -1;
        }
        else if(animal1.getSpeed() < animal2.getSpeed()){
            num= 1;
        }
        return num;

    }
}
