package com.javarush.island.bulanov.animals.predator;

import com.javarush.island.bulanov.animals.Animal;
import com.javarush.island.bulanov.animals.Predator;
import com.javarush.island.bulanov.constants.WeightAnimalsOnStartSimulation;

public class Bear extends Animal implements Predator{
    public Bear(){
        setWeight(WeightAnimalsOnStartSimulation.WEIGHT_BEAR);
    }
    @Override
    public void toEatMeet(){

    }

    @Override
    public void multiply(){

    }

    @Override
    public void chooseTheDirectionOfMovement(){

    }
}
