package com.javarush.island.bulanov.animals.herbivorous;

import com.javarush.island.bulanov.animals.Herbivorous;
import com.javarush.island.bulanov.constants.FoodNeedForFullSaturation;
import com.javarush.island.bulanov.constants.WeightAnimalsOnStartSimulation;

import java.util.Objects;
import java.util.UUID;

public class WildBoar extends Herbivorous{
    public UUID getId(){
        return id;
    }

    private final UUID id = UUID.randomUUID();

    @Override
    public String toString(){
        return "WildBoar{" +
                "id=" + id +
                '}';
    }

    public WildBoar(){
        setWeight(WeightAnimalsOnStartSimulation.WEIGHT_WILD_BOAR);
        setFoodForFullSaturation(FoodNeedForFullSaturation.FULL_SATURATION_WILD_BOAR);
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (!(o instanceof WildBoar wildBoar)) return false;
        return Objects.equals(id, wildBoar.id);
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
