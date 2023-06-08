package com.javarush.island.bulanov.animals;

public abstract class Bio{
    public int getWeight(){
        return weight;
    }

    public void setWeight(int weight){
        this.weight = weight;
    }

    private int weight;
    public abstract void multiply();
}
