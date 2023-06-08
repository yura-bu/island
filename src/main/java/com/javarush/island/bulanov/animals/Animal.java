package com.javarush.island.bulanov.animals;

import com.javarush.island.bulanov.constants.MaxNumberOfAnimalsOnCage;

public abstract class Animal extends Bio{
    public int getFoodForFullSaturation(){
        return foodForFullSaturation;
    }

    public void setFoodForFullSaturation(int foodForFullSaturation){
        this.foodForFullSaturation = foodForFullSaturation;
    }

    private int foodForFullSaturation;
    public abstract void chooseTheDirectionOfMovement();
    public abstract void toEat(Bio obj);
}
