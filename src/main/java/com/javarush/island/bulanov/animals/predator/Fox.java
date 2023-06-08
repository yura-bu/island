package com.javarush.island.bulanov.animals.predator;

import com.javarush.island.bulanov.animals.Animal;
import com.javarush.island.bulanov.animals.Bio;
import com.javarush.island.bulanov.animals.Predator;
import com.javarush.island.bulanov.constants.WeightAnimalsOnStartSimulation;

public class Fox extends Animal implements Predator{
    public Fox(){
        setWeight(WeightAnimalsOnStartSimulation.WEIGHT_FOX);
    }


    @Override
    public void multiply(){

    }

    @Override
    public void chooseTheDirectionOfMovement(){

    }

    @Override
    public void toEat(Bio obj){

    }

}
