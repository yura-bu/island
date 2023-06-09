package com.javarush.island.bulanov.animals.predator;

import com.javarush.island.bulanov.animals.*;
import java.util.Objects;
import java.util.UUID;

public class Wolf extends Predator implements Moving{
    private final UUID id = UUID.randomUUID();
    public UUID getId(){
        return id;
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (!(o instanceof Wolf wolf)) return false;
        return getId() == wolf.getId();
    }

    @Override
    public int hashCode(){
        return Objects.hash(getId());
    }


    @Override
    public void chooseTheDirectionOfMovement(){

    }
    @Override
    public String toString(){
        return "Wolf{" +
                "id=" + id +
                '}';
    }


}
