package com.javarush.island.bulanov.animals;

import static com.javarush.island.bulanov.constants.TypeSpeedMaxPopulationWeightSaturationMultiply.TYPE_SPEED_MAX_POPULATION_WEIGHT_SATURATION;

public abstract class Bio implements Multiply{

    private int weight = TYPE_SPEED_MAX_POPULATION_WEIGHT_SATURATION.get(this.getClass())[2];
    public int getWeight(){
        return weight;
    }
    public void setWeight(int weight){
        this.weight = weight;
    }

}
