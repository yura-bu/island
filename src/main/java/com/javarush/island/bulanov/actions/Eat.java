package com.javarush.island.bulanov.actions;

import com.javarush.island.bulanov.animals.Animal;
import com.javarush.island.bulanov.animals.Bio;
import com.javarush.island.bulanov.animals.Plant;
import com.javarush.island.bulanov.constants.TypeSpeedMaxPopulationWeightSaturation;
import com.javarush.island.bulanov.map.locations.Cell;
import static com.javarush.island.bulanov.actions.FoodSearch.*;
import java.lang.reflect.Type;
import java.util.*;
import java.util.concurrent.ConcurrentMap;

public class Eat {
    public static synchronized void eating(Cell cellOne){
        ConcurrentMap<Class, Set<Bio>> cell = cellOne.cell;
    Set<Bio> animalAll = new HashSet<>();
    for (var animalSet : cell.entrySet()) {
        animalAll.addAll(animalSet.getValue());
    }


    for (var animalType : cell.keySet()) {
        for (Bio a : cell.get(animalType)) {
            if (!(a instanceof Plant)) {
                Iterator<Bio> itr2 = animalAll.iterator();

                while (itr2.hasNext() && !flag) {
                    Bio animal = itr2.next();

                    foodSearch(a, animal);

                    if (iAteIt) {
                        cell.get(animal.getClass()).remove(animal);
                        itr2.remove();
                    }

                    iAteIt = false;
                }

                flag = false;
                if (((Animal) a).getFoodForFullSaturation() == TypeSpeedMaxPopulationWeightSaturation.TYPE_SPEED_MAX_POPULATION_WEIGHT_SATURATION.get(a.getClass())[3]) {
                    a.setWeight(a.getWeight() - a.getWeight() * 10 / 100);
                }
            }
        }
    }


    }


    public void starvedToDeath(Map<Type, Set<Bio>> cell){
        for( var animalType: cell.keySet()){
            var animals = cell.get(animalType);
            if(!(animals instanceof Plant) ) {
                animals.removeIf(animal -> animal.getWeight() <= TypeSpeedMaxPopulationWeightSaturation.TYPE_SPEED_MAX_POPULATION_WEIGHT_SATURATION.get(animal.getClass())[2] / 2);
            }
        }
    }

}
