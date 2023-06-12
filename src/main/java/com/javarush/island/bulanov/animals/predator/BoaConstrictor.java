package com.javarush.island.bulanov.animals.predator;


import com.javarush.island.bulanov.animals.Predator;
import com.javarush.island.bulanov.constants.FoodNeedForFullSaturation;
import com.javarush.island.bulanov.constants.WeightAnimalsOnStartSimulation;

import java.util.UUID;

public class BoaConstrictor extends Predator{
    public UUID getId(){
        return id;
    }

    private final UUID id = UUID.randomUUID();
    public BoaConstrictor(){
        setWeight(WeightAnimalsOnStartSimulation.WEIGHT_BOA_CONSTRICTOR);
        setFoodForFullSaturation(FoodNeedForFullSaturation.FULL_SATURATION_CONSTRICTOR);
    }


    @Override
    public void multiply(){

    }

    @Override
    public void chooseTheDirectionOfMovement(){

    }
    @Override
    public String toString(){
        return "BoaConstrictor{" +
                "id=" + id +
                '}';
    }



}
