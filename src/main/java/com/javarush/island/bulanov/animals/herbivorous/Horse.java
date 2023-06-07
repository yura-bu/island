package com.javarush.island.bulanov.animals.herbivorous;

import com.javarush.island.bulanov.animals.Animal;
import com.javarush.island.bulanov.animals.Herbivorous;
import com.javarush.island.bulanov.constants.WeightAnimalsOnStartSimulation;

public class Horse extends Animal implements Herbivorous{
    public Horse(){
        setWeight(WeightAnimalsOnStartSimulation.WEIGHT_HORSE);
    }
    @Override
    public void toEatPlant(){

    }

    @Override
    public void multiply(){

    }

    @Override
    public void chooseTheDirectionOfMovement(){

    }
}
