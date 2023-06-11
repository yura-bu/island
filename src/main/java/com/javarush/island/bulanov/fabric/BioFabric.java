package com.javarush.island.bulanov.fabric;

import com.javarush.island.bulanov.animals.Bio;
import com.javarush.island.bulanov.animals.predator.*;

import java.util.Set;

public class BioFabric{

    public Bio createAnimals(String type){
        return switch (type){
            case "Wolf" -> new Wolf();
            case "Fox" -> new Fox();
            case "Eagle" -> new Eagle();
            case "BoaConstrictor" -> new BoaConstrictor();
            case "Bear" -> new Bear();
            default -> null;
        };

    }
}
