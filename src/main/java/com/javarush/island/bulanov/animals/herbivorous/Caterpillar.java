package com.javarush.island.bulanov.animals.herbivorous;


import com.javarush.island.bulanov.animals.Herbivorous;
import com.javarush.island.bulanov.constants.FoodNeedForFullSaturation;
import com.javarush.island.bulanov.constants.MaxNumberOfAnimalsOnCage;
import com.javarush.island.bulanov.constants.WeightAnimalsOnStartSimulation;

import java.util.Objects;
import java.util.UUID;

/* Гусеница*/
public class Caterpillar extends Herbivorous{
    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (!(o instanceof Caterpillar that)) return false;
        return id.equals(that.id);
    }

    @Override
    public int hashCode(){
        return Objects.hash(id);
    }

    public UUID getId(){
        return id;
    }

    private final UUID id = UUID.randomUUID();
    public Caterpillar(){
        setWeight(WeightAnimalsOnStartSimulation.WEIGHT_CATERPILLAR);
        setFoodForFullSaturation(FoodNeedForFullSaturation.FULL_SATURATION_CATERPILLAR);
        setMaxNumberOfAnimalsOnCage(MaxNumberOfAnimalsOnCage.MAX_ON_CAGE_CATERPILLAR);
    }

    @Override
    public void multiply(){

    }

    @Override
    public void chooseTheDirectionOfMovement(){

    }


}
