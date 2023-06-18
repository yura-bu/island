package com.javarush.island.bulanov.animals.herbivorous;

import com.javarush.island.bulanov.animals.Herbivorous;
import java.util.Objects;
import java.util.UUID;

public class Sheep extends Herbivorous{
    public UUID getId(){
        return id;
    }

    private final UUID id = UUID.randomUUID();

    @Override
    public String toString(){
        return "Sheep{" +
                "id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (!(o instanceof Sheep sheep)) return false;
        return id.equals(sheep.id);
    }

    @Override
    public int hashCode(){
        return Objects.hash(id);
    }



    @Override
    public void chooseTheDirectionOfMovement(){

    }

}
