package com.javarush.island.bulanov.animals.herbivorous;

import com.javarush.island.bulanov.animals.Animal;
import com.javarush.island.bulanov.animals.Herbivorous;
import com.javarush.island.bulanov.constants.WeightAnimalsOnStartSimulation;

public class Rabbit extends Animal implements Herbivorous{
    public Rabbit(){
        setWeight(WeightAnimalsOnStartSimulation.WEIGHT_RABBIT);
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
