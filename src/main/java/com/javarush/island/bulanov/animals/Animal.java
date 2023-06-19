package com.javarush.island.bulanov.animals;

import static com.javarush.island.bulanov.constants.TypeSpeedMaxPopulationWeightSaturationMultiply.TYPE_SPEED_MAX_POPULATION_WEIGHT_SATURATION;

public abstract class Animal extends Bio {
    public abstract boolean eat(Bio obj);
    public int getFoodForFullSaturation(){
        return foodForFullSaturation;
    }

    public void setFoodForFullSaturation(int foodForFullSaturation){
        this.foodForFullSaturation = foodForFullSaturation;
    }
    private int foodForFullSaturation = TYPE_SPEED_MAX_POPULATION_WEIGHT_SATURATION.get(this.getClass())[3];
    public int getSpeedMoving(){
        return speedMoving;
    }

    public void setSpeedMoving(int speedMoving){
        this.speedMoving = speedMoving;
    }

    private  int speedMoving;
    public abstract void chooseTheDirectionOfMovement();

}
