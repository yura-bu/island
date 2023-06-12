package com.javarush.island.bulanov.animals;


import com.javarush.island.bulanov.constants.WeightAnimalsOnStartSimulation;

import java.util.UUID;

public class Plant extends Bio{
    public UUID getId(){
        return id;
    }

    @Override
    public String toString(){
        return "Plant{" +
                "id=" + id +
                '}';
    }

    private final UUID id = UUID.randomUUID();
    public Plant(){
        setWeight(WeightAnimalsOnStartSimulation.WEIGHT_PLANT);
    }

    @Override
    public void multiply(){

    }
}
