package com.javarush.island.bulanov.animals.herbivorous;


import com.javarush.island.bulanov.animals.Herbivorous;
import com.javarush.island.bulanov.constants.FoodNeedForFullSaturation;
import com.javarush.island.bulanov.constants.MaxNumberOfAnimalsOnCage;
import com.javarush.island.bulanov.constants.WeightAnimalsOnStartSimulation;

import java.util.Objects;
import java.util.UUID;

public class Rabbit extends Herbivorous{
    public UUID getId(){
        return id;
    }

    private final UUID id = UUID.randomUUID();
    public Rabbit(){
        setWeight(WeightAnimalsOnStartSimulation.WEIGHT_RABBIT);
        setFoodForFullSaturation(FoodNeedForFullSaturation.FULL_SATURATION_RABBIT);
        setMaxNumberOfAnimalsOnCage(MaxNumberOfAnimalsOnCage.MAX_ON_CAGE_RABBIT);
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (!(o instanceof Rabbit rabbit)) return false;
        return id.equals(rabbit.id);
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
