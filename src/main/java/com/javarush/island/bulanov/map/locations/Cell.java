package com.javarush.island.bulanov.map.locations;

import com.javarush.island.bulanov.animals.Bio;
import com.javarush.island.bulanov.constants.TypeSpeedMaxPopulation;
import com.javarush.island.bulanov.functions.BirthOfLiving;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Cell{
    public Map<Type, Set<Bio>> creatingCell(){
        Map<Type, Set<Bio>> cell = new HashMap<>();
        Set<Class> types = TypeSpeedMaxPopulation.typeSpeedMaxPopulation.keySet();
        for( var type: types) {
            cell.put(type, new BirthOfLiving().birthOfLiving(type, TypeSpeedMaxPopulation.typeSpeedMaxPopulation.get(type)[1]));
        }
        return cell;
    }
}
