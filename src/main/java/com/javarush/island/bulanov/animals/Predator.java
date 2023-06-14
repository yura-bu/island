package com.javarush.island.bulanov.animals;
import static com.javarush.island.bulanov.functions.FoodSearch.iAteIt;

public abstract class Predator extends Animal{
    public  boolean eat(Bio obj){
        boolean flag = false;
        if (!(obj instanceof Plant)) {
            if ((getFoodForFullSaturation() - obj.getWeight()) > 0) {
                setFoodForFullSaturation(getFoodForFullSaturation() - obj.getWeight());
                setWeight(getWeight() + obj.getWeight() * 10 / 100);
                System.out.printf("%s съел %s еще хочу%n", this.getClass().getSimpleName(), obj.getClass().getSimpleName());
                iAteIt = true;
            } else if (getFoodForFullSaturation() > 0) {
                System.out.printf("%s съел %s и объелся%n", this.getClass().getSimpleName(), obj.getClass().getSimpleName());
                setWeight(getWeight() + getFoodForFullSaturation() * 10 / 100);
                setFoodForFullSaturation(0);
                iAteIt = true;
            } else flag = true;
        }
        return flag;
    }
}
