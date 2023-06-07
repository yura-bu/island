package com.javarush.island.bulanov.animals.predator;

import com.javarush.island.bulanov.animals.Animal;
import com.javarush.island.bulanov.animals.Predator;
import com.javarush.island.bulanov.constants.WeightAnimalsOnStartSimulation;

public class Wolf extends Animal implements Predator{

    public Wolf(){
        setWeight(WeightAnimalsOnStartSimulation.WEIGHT_WOLF);
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
