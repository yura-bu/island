package com.javarush.island.bulanov.animals.herbivorous;

import com.javarush.island.bulanov.animals.Herbivorous;
import com.javarush.island.bulanov.constants.FoodNeedForFullSaturation;
import com.javarush.island.bulanov.constants.MaxNumberOfAnimalsOnCage;
import com.javarush.island.bulanov.constants.WeightAnimalsOnStartSimulation;

import java.util.Objects;
import java.util.UUID;

public class Mouse extends Herbivorous{
    public UUID getId(){
        return id;
    }

    private final UUID id = UUID.randomUUID();
    public Mouse(){
        setWeight(WeightAnimalsOnStartSimulation.WEIGHT_MOUSE);
        setFoodForFullSaturation(FoodNeedForFullSaturation.FULL_SATURATION_MOUSE);
        setMaxNumberOfAnimalsOnCage(MaxNumberOfAnimalsOnCage.MAX_ON_CAGE_MOUSE);
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (!(o instanceof Mouse mouse)) return false;
        return id.equals(mouse.id);
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

}
