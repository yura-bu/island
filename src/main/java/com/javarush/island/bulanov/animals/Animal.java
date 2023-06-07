package com.javarush.island.bulanov.animals;

public abstract class Animal{
    private int weight;
    private int speed;
    private int foodForFullSaturation;

    public int getWeight(){
        return weight;
    }

    public void setWeight(int weight){
        this.weight = weight;
    }

    public int getSpeed(){
        return speed;
    }

    public void setSpeed(int speed){
        this.speed = speed;
    }

    public int getFoodForFullSaturation(){
        return foodForFullSaturation;
    }

    public void setFoodForFullSaturation(int foodForFullSaturation){
        this.foodForFullSaturation = foodForFullSaturation;
    }

    public abstract void multiply();
    public abstract void chooseTheDirectionOfMovement();
}
