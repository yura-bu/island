package com.javarush.island.bulanov.animals.herbivorous;

import com.javarush.island.bulanov.animals.Herbivorous;
import com.javarush.island.bulanov.animals.Moving;
import java.util.Objects;
import java.util.UUID;

public class Mouse extends Herbivorous implements Moving{
    public UUID getId(){
        return id;
    }

    private final UUID id = UUID.randomUUID();

    @Override
    public String toString(){
        return "Mouse{" +
                "id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (!(o instanceof Mouse mouse)) return false;
        return id.equals(mouse.id);
    }

    @Override
    public int hashCode(){
        return Objects.hash(id);
    }



    @Override
    public void chooseTheDirectionOfMovement(){

    }

}
