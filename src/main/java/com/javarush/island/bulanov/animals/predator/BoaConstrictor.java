package com.javarush.island.bulanov.animals.predator;


import com.javarush.island.bulanov.animals.Predator;
import java.util.UUID;

public class BoaConstrictor extends Predator{
    public UUID getId(){
        return id;
    }

    private final UUID id = UUID.randomUUID();

    @Override
    public void multiply(){

    }

    @Override
    public void chooseTheDirectionOfMovement(){

    }
    @Override
    public String toString(){
        return "BoaConstrictor{" +
                "id=" + id +
                '}';
    }



}
