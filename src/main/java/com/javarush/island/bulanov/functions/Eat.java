package com.javarush.island.bulanov.functions;

import com.javarush.island.bulanov.animals.Animal;
import com.javarush.island.bulanov.animals.Bio;
import com.javarush.island.bulanov.animals.Plant;
import com.javarush.island.bulanov.constants.TypeSpeedMaxPopulationWeightSaturation;


import static com.javarush.island.bulanov.functions.FoodSearch.*;

import java.lang.reflect.Type;
import java.util.*;

public class Eat{
    public void eating(Map<Type, Set<Bio>> cell){

        Set<Bio> animalAll = new HashSet<>();
       for(var animalSet: cell.entrySet()){
           animalAll.addAll(animalSet.getValue());
       }
        System.out.println(animalAll.size());
        for(var animalType: cell.keySet()) {
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
        System.out.println(animalAll.size());
    }
}
