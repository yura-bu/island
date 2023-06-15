package com.javarush.island.bulanov.animals;


import com.javarush.island.bulanov.constants.TypeSpeedMaxPopulationWeightSaturation;

public abstract class Animal extends Bio{

    public abstract boolean eat(Bio obj);
    public int getFoodForFullSaturation(){
        return foodForFullSaturation;
    }

    public void setFoodForFullSaturation(int foodForFullSaturation){
        this.foodForFullSaturation = foodForFullSaturation;
    }

    private int foodForFullSaturation = TypeSpeedMaxPopulationWeightSaturation.TYPE_SPEED_MAX_POPULATION_WEIGHT_SATURATION.get(this.getClass())[3];
    public abstract void chooseTheDirectionOfMovement();

}
