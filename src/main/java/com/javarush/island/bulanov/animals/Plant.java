package com.javarush.island.bulanov.animals;


import java.util.UUID;

public class Plant extends Bio{
    private final int numberOfOffspring = 1;
    public UUID getId(){
        return id;
    }

    @Override
    public String toString(){
        return "Plant{" +
                "id=" + id +
                '}';
    }

    private final UUID id = UUID.randomUUID();

    @Override
    public void multiply(int numberOfOffspring){

    }
}
