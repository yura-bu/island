package com.javarush.island.bulanov.animals;

public abstract class Predator extends Animal{
    public  void eat(Bio obj){
        if (obj instanceof Herbivorous) {
            if ((getFoodForFullSaturation() - obj.getWeight()) > 0) {
                setFoodForFullSaturation(getFoodForFullSaturation() - obj.getWeight());
                setWeight(getWeight() + obj.getWeight() * 10 / 100);
                System.out.println("Я еще хочу");
            } else if (getFoodForFullSaturation() > 0) {
                System.out.println("Я объелся");
                setWeight(getWeight() + getFoodForFullSaturation() * 10 / 100);
                setFoodForFullSaturation(0);
            } else System.out.println("Я не голоден");
        }
    }
}
