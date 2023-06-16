package com.javarush.island.bulanov.animals.herbivorous;


import com.javarush.island.bulanov.animals.Bio;
import com.javarush.island.bulanov.animals.Herbivorous;
import com.javarush.island.bulanov.animals.Plant;
import static com.javarush.island.bulanov.functions.FoodSearch.iAteIt;

import java.util.Objects;
import java.util.UUID;

public class Duck extends Herbivorous{
    public UUID getId(){
        return id;
    }

    @Override
    public String toString(){
        return "Duck{" +
                "id=" + id +
                '}';
    }

    private final UUID id = UUID.randomUUID();
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
    public boolean eat(Bio obj){
        if(obj instanceof Plant || obj instanceof Caterpillar){
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
