package com.javarush.island.bulanov.animals.predator;

import com.javarush.island.bulanov.animals.Predator;
import com.javarush.island.bulanov.constants.FoodNeedForFullSaturation;
import com.javarush.island.bulanov.constants.WeightAnimalsOnStartSimulation;

import java.util.Objects;
import java.util.UUID;

public class Eagle extends  Predator{
    public UUID getId(){
        return id;
    }


    private final UUID id = UUID.randomUUID();
    public Eagle(){
        setWeight(WeightAnimalsOnStartSimulation.WEIGHT_EAGLE);
        setFoodForFullSaturation(FoodNeedForFullSaturation.FULL_SATURATION_EAGLE);
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (!(o instanceof Eagle eagle)) return false;
        return getId() == eagle.getId();
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
        return "Eagle{" +
                "id=" + id +
                '}';
    }
}
