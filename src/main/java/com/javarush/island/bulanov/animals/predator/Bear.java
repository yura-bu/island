package com.javarush.island.bulanov.animals.predator;

import com.javarush.island.bulanov.animals.Animal;
import com.javarush.island.bulanov.animals.Bio;
import com.javarush.island.bulanov.animals.Predator;
import com.javarush.island.bulanov.constants.FoodNeedForFullSaturation;
import com.javarush.island.bulanov.constants.WeightAnimalsOnStartSimulation;

public class Bear extends Animal implements Predator{
    public static final int foodForFullSaturation = FoodNeedForFullSaturation.FULL_SATURATION_BEAR;
    public Bear(){
        setWeight(WeightAnimalsOnStartSimulation.WEIGHT_BEAR);
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
