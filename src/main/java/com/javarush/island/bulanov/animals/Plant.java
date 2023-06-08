package com.javarush.island.bulanov.animals;

import com.javarush.island.bulanov.constants.WeightAnimalsOnStartSimulation;

public class Plant extends Bio{

    public Plant(){
        setWeight(WeightAnimalsOnStartSimulation.WEIGHT_PLANT);
    }

    @Override
    public void multiply(){

    }
}
