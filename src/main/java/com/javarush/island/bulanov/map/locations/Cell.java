package com.javarush.island.bulanov.map.locations;


import com.javarush.island.bulanov.animals.Bio;
import com.javarush.island.bulanov.constants.TypeSpeedMaxPopulationWeightSaturation;
import com.javarush.island.bulanov.actions.BirthOfLiving;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
public class Cell{
    public ConcurrentHashMap<Class, Set<Bio>> cell = new ConcurrentHashMap<>();
    public Cell(){
        Set<Class> types = TypeSpeedMaxPopulationWeightSaturation.TYPE_SPEED_MAX_POPULATION_WEIGHT_SATURATION.keySet();
        for (var type : types) {
            cell.put(type, new BirthOfLiving().birthOfLiving(type, TypeSpeedMaxPopulationWeightSaturation.TYPE_SPEED_MAX_POPULATION_WEIGHT_SATURATION.get(type)[1]));
        }
    }
}

