package com.javarush.island.bulanov.animals;
import static com.javarush.island.bulanov.functions.FoodSearch.iAteIt;
public abstract class Herbivorous extends Animal{

    public boolean eat(Bio obj){
//        boolean flag = false;
        if(obj instanceof Plant){
            if ((getFoodForFullSaturation() - obj.getWeight()) > 0) {
                setFoodForFullSaturation(getFoodForFullSaturation() - obj.getWeight());
                setWeight(getWeight() + obj.getWeight() * 10 / 100);
                System.out.printf("%s съел %s еще хочу%n", this, obj.getClass().getSimpleName());
            } else {
                System.out.printf("%s съел %s и объелся%n", this, obj.getClass().getSimpleName());
                setWeight(getWeight() + getFoodForFullSaturation() * 10 / 100);
                setFoodForFullSaturation(0);
            }
            iAteIt = true;
        }
        return true;
    }
}
