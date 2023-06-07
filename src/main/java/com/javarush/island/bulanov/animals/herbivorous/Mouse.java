package com.javarush.island.bulanov.animals.herbivorous;

import com.javarush.island.bulanov.animals.Animal;
import com.javarush.island.bulanov.animals.Herbivorous;
import com.javarush.island.bulanov.constants.WeightAnimalsOnStartSimulation;

public class Mouse extends Animal implements Herbivorous{
    public Mouse(){
        setWeight(WeightAnimalsOnStartSimulation.WEIGHT_MOUSE);
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
