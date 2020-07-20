package com.stayready.as03.problem05;

import java.util.Comparator;

public class SpeedComparator implements Comparator<Animal> {

    public int compare(Animal o1, Animal o2) {
        if(o1.speed() == o2.speed())
        return 0;

        if(o1.speed() > o2.speed())
        return -1;

        if(o1.speed() < o2.speed())
        return 1;

        else return 0;

}

}

