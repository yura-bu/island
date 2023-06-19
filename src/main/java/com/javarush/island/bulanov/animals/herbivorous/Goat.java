package com.javarush.island.bulanov.animals.herbivorous;


import com.javarush.island.bulanov.animals.Herbivorous;
import com.javarush.island.bulanov.animals.Moving;
import java.util.Objects;
import java.util.UUID;

/* Коза */
public class Goat extends Herbivorous implements Moving{
    public UUID getId(){
        return id;
    }

    @Override
    public String toString(){
        return "Goat{" +
                "id=" + id +
                '}';
    }

    private final UUID id = UUID.randomUUID();

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (!(o instanceof Goat goat)) return false;
        return id.equals(goat.id);
    }

    @Override
    public int hashCode(){
        return Objects.hash(id);
    }



    @Override
    public void chooseTheDirectionOfMovement(){

    }

}
