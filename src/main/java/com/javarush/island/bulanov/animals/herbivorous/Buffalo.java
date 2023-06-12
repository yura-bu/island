package com.javarush.island.bulanov.animals.herbivorous;

import com.javarush.island.bulanov.animals.Herbivorous;
import com.javarush.island.bulanov.constants.FoodNeedForFullSaturation;
import com.javarush.island.bulanov.constants.WeightAnimalsOnStartSimulation;

import java.util.Objects;
import java.util.UUID;

public class Buffalo extends Herbivorous{
    public UUID getId(){
        return id;
    }


    private final UUID id = UUID.randomUUID();
    public Buffalo(){
        setWeight(WeightAnimalsOnStartSimulation.WEIGHT_BUFFALO);
        setFoodForFullSaturation(FoodNeedForFullSaturation.FULL_SATURATION_BUFFALO);
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (!(o instanceof Buffalo buffalo)) return false;
        return id.equals(buffalo.id);
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
        return "Buffalo{" +
                "id=" + id +
                '}';
    }


}
