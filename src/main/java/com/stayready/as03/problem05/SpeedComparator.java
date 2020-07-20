package com.stayready.as03.problem05;

import java.util.Comparator;

public class SpeedComparator implements Comparator<Animal>{

//     1. If animal1's and animal2's speed are the same, then return 0
//   2. If animal1's speed is greater than animal2 speed, then return a negative number
//   3. If animal1's speed is less than animal2 speed, then return a positive number 

    public int compare (Animal animal1, Animal animal2){

        if(animal1.getSpeed() == animal2.getSpeed()){

            return 0;
        }
        else if (animal1.getSpeed()>animal2.getSpeed()){

            return -1;
        }

        else if (animal1.getSpeed()< animal2.getSpeed()){

            return 1;
        }

        return 1; 
       

    }
}

