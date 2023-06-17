package com.javarush.island.bulanov.animals;
import static com.javarush.island.bulanov.actions.FoodSearch.iAteIt;
public abstract class Herbivorous extends Animal{

    public boolean eat(Bio obj){
//        boolean flag = false;
        if(obj instanceof Plant){
            if ((getFoodForFullSaturation() - obj.getWeight()) > 0) {
                setFoodForFullSaturation(getFoodForFullSaturation() - obj.getWeight());
                setWeight(getWeight() + obj.getWeight() * 10 / 100);
            } else {
                setWeight(getWeight() + getFoodForFullSaturation() * 10 / 100);
                setFoodForFullSaturation(0);
            }
            iAteIt = true;
        }
        return true;
    }
}
