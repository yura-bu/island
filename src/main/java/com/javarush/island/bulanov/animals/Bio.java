package com.javarush.island.bulanov.animals;

public abstract class Bio{

    private int weight;
    private int maxNumberOfAnimalsOnCage;
    public int getWeight(){
        return weight;
    }
    public void setWeight(int weight){
        this.weight = weight;
    }
    public int getMaxNumberOfAnimalsOnCage(){
        return maxNumberOfAnimalsOnCage;
    }

    public void setMaxNumberOfAnimalsOnCage(int maxNumberOfAnimalsOnCage){
        this.maxNumberOfAnimalsOnCage = maxNumberOfAnimalsOnCage;
    }


    public abstract void multiply();
}
