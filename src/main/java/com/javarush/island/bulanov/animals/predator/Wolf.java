package com.javarush.island.bulanov.animals.predator;

import com.javarush.island.bulanov.animals.*;
import com.javarush.island.bulanov.constants.FoodNeedForFullSaturation;
import com.javarush.island.bulanov.constants.MaxNumberOfAnimalsOnCage;
import com.javarush.island.bulanov.constants.WeightAnimalsOnStartSimulation;

import java.util.Objects;
import java.util.UUID;

public class Wolf extends Predator{
    private final UUID id = UUID.randomUUID();


    public Wolf(){
        setWeight(WeightAnimalsOnStartSimulation.WEIGHT_WOLF);
        setFoodForFullSaturation(FoodNeedForFullSaturation.FULL_SATURATION_WOOLF);
        setMaxNumberOfAnimalsOnCage(MaxNumberOfAnimalsOnCage.MAX_ON_CAGE_WOOLF);
    }
    public UUID getId(){
        return id;
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (!(o instanceof Wolf wolf)) return false;
        return getId() == wolf.getId();
    }

    @Override
    public int hashCode(){
        return Objects.hash(getId());
    }

    @Override
    public void multiply(){

    }

    @Override
    public void chooseTheDirectionOfMovement(){

    }
    @Override
    public String toString(){
        return "Wolf{" +
                "id=" + id +
                '}';
    }


}
