package com.javarush.island.bulanov.fabric;

import com.javarush.island.bulanov.animals.Bio;
import com.javarush.island.bulanov.animals.Plant;
import com.javarush.island.bulanov.animals.herbivorous.*;
import com.javarush.island.bulanov.animals.predator.*;

public class BioFabric{

    public Bio createAnimals(String typeAnimal){
        return switch (typeAnimal){
            case "Wolf" -> new Wolf();
            case "Fox" -> new Fox();
            case "Eagle" -> new Eagle();
            case "BoaConstrictor" -> new BoaConstrictor();
            case "Bear" -> new Bear();
            case "Buffalo" -> new Buffalo();
            case "Caterpillar" -> new Caterpillar();
            case "Deer" -> new Deer();
            case "Duck" -> new Duck();
            case "Goat" -> new Goat();
            case "Horse" -> new Horse();
            case "Mouse" -> new Mouse();
            case "Rabbit" -> new Rabbit();
            case "Sheep" -> new Sheep();
            case "WildBoar" -> new WildBoar();
            case "Plant" -> new Plant();
            default -> null;
        };

    }
}
