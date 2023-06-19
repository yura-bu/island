package com.javarush.island.bulanov.animals.predator;


import com.javarush.island.bulanov.animals.Moving;
import com.javarush.island.bulanov.animals.Predator;
import java.util.UUID;

public class BoaConstrictor extends Predator implements Moving{
    public UUID getId(){
        return id;
    }

    private final UUID id = UUID.randomUUID();



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
