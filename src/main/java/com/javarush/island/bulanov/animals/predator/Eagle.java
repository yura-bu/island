package com.javarush.island.bulanov.animals.predator;

import com.javarush.island.bulanov.animals.Moving;
import com.javarush.island.bulanov.animals.Predator;
import java.util.Objects;
import java.util.UUID;

public class Eagle extends  Predator implements Moving{
    public UUID getId(){
        return id;
    }


    private final UUID id = UUID.randomUUID();
    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (!(o instanceof Eagle eagle)) return false;
        return getId() == eagle.getId();
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
        return "Eagle{" +
                "id=" + id +
                '}';
    }
}
