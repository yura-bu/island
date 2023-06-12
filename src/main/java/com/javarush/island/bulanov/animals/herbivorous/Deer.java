package com.javarush.island.bulanov.animals.herbivorous;

import com.javarush.island.bulanov.animals.Herbivorous;
import com.javarush.island.bulanov.constants.FoodNeedForFullSaturation;
import com.javarush.island.bulanov.constants.WeightAnimalsOnStartSimulation;

import java.util.Objects;
import java.util.UUID;
/* Олень*/
public class Deer extends Herbivorous{
    public UUID getId(){
        return id;
    }

    @Override
    public String toString(){
        return "Deer{" +
                "id=" + id +
                '}';
    }

    private final UUID id = UUID.randomUUID();
    public Deer(){
        setWeight(WeightAnimalsOnStartSimulation.WEIGHT_DEER);
        setFoodForFullSaturation(FoodNeedForFullSaturation.FULL_SATURATION_DEER);
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (!(o instanceof Deer deer)) return false;
        return id.equals(deer.id);
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

