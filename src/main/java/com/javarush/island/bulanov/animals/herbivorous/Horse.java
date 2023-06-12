package com.javarush.island.bulanov.animals.herbivorous;

import com.javarush.island.bulanov.animals.Herbivorous;
import com.javarush.island.bulanov.constants.FoodNeedForFullSaturation;
import com.javarush.island.bulanov.constants.WeightAnimalsOnStartSimulation;

import java.util.Objects;
import java.util.UUID;

public class Horse extends Herbivorous{
    public UUID getId(){
        return id;
    }

    private final UUID id = UUID.randomUUID();

    @Override
    public String toString(){
        return "Horse{" +
                "id=" + id +
                '}';
    }

    public Horse(){
        setWeight(WeightAnimalsOnStartSimulation.WEIGHT_HORSE);
        setFoodForFullSaturation(FoodNeedForFullSaturation.FULL_SATURATION_HORSE);
    }

    @Override
    public void multiply(){

    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (!(o instanceof Horse horse)) return false;
        return id.equals(horse.id);
    }

    @Override
    public int hashCode(){
        return Objects.hash(id);
    }

    @Override
    public void chooseTheDirectionOfMovement(){

    }

}
