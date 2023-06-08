package com.javarush.island.bulanov.animals.herbivorous;

import com.javarush.island.bulanov.animals.Animal;
import com.javarush.island.bulanov.animals.Bio;
import com.javarush.island.bulanov.animals.Herbivorous;
import com.javarush.island.bulanov.constants.WeightAnimalsOnStartSimulation;

public class Buffalo extends Animal implements Herbivorous{
    public Buffalo(){
        setWeight(WeightAnimalsOnStartSimulation.WEIGHT_BUFFALO);
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
