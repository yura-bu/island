package com.javarush.island.bulanov.animals.herbivorous;


import com.javarush.island.bulanov.animals.Bio;
import com.javarush.island.bulanov.animals.Herbivorous;
import com.javarush.island.bulanov.constants.FoodNeedForFullSaturation;
import com.javarush.island.bulanov.constants.WeightAnimalsOnStartSimulation;

import java.util.Objects;
import java.util.UUID;

public class Duck extends Herbivorous{
    public UUID getId(){
        return id;
    }

    private final UUID id = UUID.randomUUID();
    public Duck(){
        setWeight(WeightAnimalsOnStartSimulation.WEIGHT_DUCK);
        setFoodForFullSaturation(FoodNeedForFullSaturation.FULL_SATURATION_DUCK);
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (!(o instanceof Duck duck)) return false;
        return id.equals(duck.id);
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
    public void eat(Bio obj){
        super.eat(obj);
    }
}
