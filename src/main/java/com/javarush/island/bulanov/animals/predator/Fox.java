package com.javarush.island.bulanov.animals.predator;

import com.javarush.island.bulanov.animals.Predator;
import com.javarush.island.bulanov.constants.FoodNeedForFullSaturation;
import com.javarush.island.bulanov.constants.MaxNumberOfAnimalsOnCage;
import com.javarush.island.bulanov.constants.WeightAnimalsOnStartSimulation;

import java.util.Objects;
import java.util.UUID;

public class Fox extends Predator{

    public UUID getId(){
        return id;
    }

    private final UUID id = UUID.randomUUID();
    public Fox(){
        setWeight(WeightAnimalsOnStartSimulation.WEIGHT_FOX);
        setFoodForFullSaturation(FoodNeedForFullSaturation.FULL_SATURATION_FOX);
        setMaxNumberOfAnimalsOnCage(MaxNumberOfAnimalsOnCage.MAX_ON_CAGE_FOX);
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fox fox = (Fox) o;
        return id == fox.id;
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
        return "Fox{" +
                "id=" + id +
                '}';
    }


}
