package com.javarush.island.bulanov.animals.herbivorous;

import com.javarush.island.bulanov.animals.Animal;
import com.javarush.island.bulanov.animals.Bio;
import com.javarush.island.bulanov.animals.Herbivorous;
import com.javarush.island.bulanov.constants.WeightAnimalsOnStartSimulation;
/* Коза */
public class Goat extends Animal implements Herbivorous{
    public Goat(){
        setWeight(WeightAnimalsOnStartSimulation.WEIGHT_GOAT);
    }

    @Override
    public void multiply(){

    }

    @Override
    public void chooseTheDirectionOfMovement(){

    }

    @Override
    public void toEat(Bio obj){

    }
}
