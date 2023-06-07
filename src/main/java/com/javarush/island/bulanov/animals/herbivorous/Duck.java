package com.javarush.island.bulanov.animals.herbivorous;

import com.javarush.island.bulanov.animals.Animal;
import com.javarush.island.bulanov.animals.Herbivorous;
import com.javarush.island.bulanov.constants.WeightAnimalsOnStartSimulation;

public class Duck extends Animal implements Herbivorous{

    public Duck(){
        setWeight(WeightAnimalsOnStartSimulation.WEIGHT_DUCK);
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
