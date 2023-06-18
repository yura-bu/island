package com.javarush.island.bulanov.actions;

import com.javarush.island.bulanov.animals.Bio;
import com.javarush.island.bulanov.animals.Plant;
import com.javarush.island.bulanov.constants.TypeSpeedMaxPopulationWeightSaturationMultiply;
import com.javarush.island.bulanov.map.locations.Cell;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;

import static com.javarush.island.bulanov.constants.TypeSpeedMaxPopulationWeightSaturationMultiply.TYPE_SPEED_MAX_POPULATION_WEIGHT_SATURATION;

public class Multiply{
    public static synchronized void multiplying(Cell cellOne){
        ConcurrentMap<Class, Set<Bio>> cell = cellOne.cell;
        int numberOfPairs = 0;
        for(var type: cell.keySet()){
            if(!type.getSimpleName().equals("Plant") && !cell.get(type).isEmpty()){
                numberOfPairs = cell.get(type).size()/2;
                if(numberOfPairs != 0 && cell.get(type).size() < TYPE_SPEED_MAX_POPULATION_WEIGHT_SATURATION.get(type)[1]){
                    Set<Bio> animals = cell.get(type);
                    for (int i = 0; i < numberOfPairs; i++) {
                        animals.addAll(new BirthOfLiving().birthOfLiving(type, TYPE_SPEED_MAX_POPULATION_WEIGHT_SATURATION.get(type)[4]));
                    }
                }
            }else cell.get(Plant.class).addAll(new BirthOfLiving().birthOfLiving(Plant.class, TYPE_SPEED_MAX_POPULATION_WEIGHT_SATURATION.get(Plant.class)[4]));
        }
    }
}
