package com.javarush.island.bulanov.animals.herbivorous;

import com.javarush.island.bulanov.animals.Herbivorous;
import com.javarush.island.bulanov.constants.FoodNeedForFullSaturation;
import com.javarush.island.bulanov.constants.WeightAnimalsOnStartSimulation;
import java.util.Objects;
import java.util.UUID;

public class Sheep extends Herbivorous{
    public UUID getId(){
        return id;
    }

    private final UUID id = UUID.randomUUID();
    public Sheep(){
        setWeight(WeightAnimalsOnStartSimulation.WEIGHT_SHEEP);
        setFoodForFullSaturation(FoodNeedForFullSaturation.FULL_SATURATION_SHEEP);
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (!(o instanceof Sheep sheep)) return false;
        return id.equals(sheep.id);
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
