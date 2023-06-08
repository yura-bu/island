package com.javarush.island.bulanov.animals.predator;

import com.javarush.island.bulanov.animals.*;
import com.javarush.island.bulanov.constants.FoodNeedForFullSaturation;
import com.javarush.island.bulanov.constants.WeightAnimalsOnStartSimulation;

public class Wolf extends Animal implements Predator{
    public Wolf(){
        setWeight(WeightAnimalsOnStartSimulation.WEIGHT_WOLF);
        setFoodForFullSaturation(FoodNeedForFullSaturation.FULL_SATURATION_WOOLF);
    }

    @Override
    public void multiply(){

    }

    @Override
    public void chooseTheDirectionOfMovement(){

    }

    @Override
    public void toEat(Bio obj){
        if (obj instanceof Plant){
            System.out.println("Я не ем траву. Я хищник");
        } else if(obj instanceof Predator) {
            System.out.println("я не ем хищников - мясо жесткое");
        }else if ((getFoodForFullSaturation() - obj.getWeight()) > 0){
            setFoodForFullSaturation(getFoodForFullSaturation() - obj.getWeight());
            setWeight(getWeight() + obj.getWeight()*10/100);
            System.out.println("Я еще хочу");
        }else if (getFoodForFullSaturation() > 0){
            System.out.println("Я объелся");
            setWeight(getWeight() + getFoodForFullSaturation()*10/100);
            setFoodForFullSaturation(0);
        } else System.out.println("Я не голоден");


    }

}
