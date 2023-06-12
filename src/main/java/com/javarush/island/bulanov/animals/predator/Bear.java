package com.javarush.island.bulanov.animals.predator;

import com.javarush.island.bulanov.animals.Predator;
import com.javarush.island.bulanov.constants.FoodNeedForFullSaturation;
import com.javarush.island.bulanov.constants.MaxNumberOfAnimalsOnCage;
import com.javarush.island.bulanov.constants.WeightAnimalsOnStartSimulation;

import java.util.Objects;
import java.util.UUID;

public class Bear extends Predator{

    public UUID getId(){
        return id;
    }

    private final UUID id = UUID.randomUUID();
    public Bear(){
        setWeight(WeightAnimalsOnStartSimulation.WEIGHT_BEAR);
        setFoodForFullSaturation(FoodNeedForFullSaturation.FULL_SATURATION_BEAR);
        setMaxNumberOfAnimalsOnCage(MaxNumberOfAnimalsOnCage.MAX_ON_CAGE_BEAR);
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (!(o instanceof Bear bear)) return false;
        return id == bear.id;
    }

    @Override
    public int hashCode(){
        return Objects.hash(id);
    }

    @Override
    public void multiply(){

    }
    @Override
    public void chooseTheDirectionOfMovement(){

    }
    @Override
    public String toString(){
        return "Bear{" +
                "id=" + id +
                '}';
    }

}
