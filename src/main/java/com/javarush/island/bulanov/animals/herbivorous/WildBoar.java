package com.javarush.island.bulanov.animals.herbivorous;

import com.javarush.island.bulanov.animals.Animal;
import com.javarush.island.bulanov.animals.Herbivorous;
import com.javarush.island.bulanov.constants.WeightAnimalsOnStartSimulation;

public class WildBoar extends Animal implements Herbivorous{
    public WildBoar(){
        setWeight(WeightAnimalsOnStartSimulation.WEIGHT_WILD_BOAR);
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
