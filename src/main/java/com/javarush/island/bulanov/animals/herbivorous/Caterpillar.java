package com.javarush.island.bulanov.animals.herbivorous;


import com.javarush.island.bulanov.animals.Herbivorous;
import java.util.Objects;
import java.util.UUID;

/* Гусеница*/
public class Caterpillar extends Herbivorous{
    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (!(o instanceof Caterpillar that)) return false;
        return id.equals(that.id);
    }

    @Override
    public int hashCode(){
        return Objects.hash(id);
    }

    public UUID getId(){
        return id;
    }

    @Override
    public String toString(){
        return "Caterpillar{" +
                "id=" + id +
                '}';
    }

    private final UUID id = UUID.randomUUID();

    @Override
    public void chooseTheDirectionOfMovement(){

    }


}
