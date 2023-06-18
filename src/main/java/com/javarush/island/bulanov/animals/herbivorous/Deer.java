package com.javarush.island.bulanov.animals.herbivorous;

import com.javarush.island.bulanov.animals.Herbivorous;
import java.util.Objects;
import java.util.UUID;
/* Олень*/
public class Deer extends Herbivorous{
    public UUID getId(){
        return id;
    }

    @Override
    public String toString(){
        return "Deer{" +
                "id=" + id +
                '}';
    }

    private final UUID id = UUID.randomUUID();
    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (!(o instanceof Deer deer)) return false;
        return id.equals(deer.id);
    }

    @Override
    public int hashCode(){
        return Objects.hash(id);
    }


    @Override
    public void chooseTheDirectionOfMovement(){

    }


}

