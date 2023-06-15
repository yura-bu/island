package com.javarush.island.bulanov.animals;

import com.javarush.island.bulanov.constants.TypeSpeedMaxPopulationWeightSaturation;

public abstract class Bio{

    private int weight = TypeSpeedMaxPopulationWeightSaturation.TYPE_SPEED_MAX_POPULATION_WEIGHT_SATURATION.get(this.getClass())[2];
    public int getWeight(){
        return weight;
    }
    public void setWeight(int weight){
        this.weight = weight;
    }

    public abstract void multiply();
}
