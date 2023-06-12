package com.javarush.island.bulanov.animals;

public abstract class Bio{

    private int weight;
    public int getWeight(){
        return weight;
    }
    public void setWeight(int weight){
        this.weight = weight;
    }

    public abstract void multiply();
}
