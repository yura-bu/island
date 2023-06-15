package com.javarush.island.bulanov;


import com.javarush.island.bulanov.animals.Bio;
import com.javarush.island.bulanov.constants.TypeSpeedMaxPopulationWeightSaturation;
import com.javarush.island.bulanov.functions.Eat;
import com.javarush.island.bulanov.map.locations.Cell;

import java.lang.reflect.Type;
import java.util.Map;
import java.util.Set;

public class Main{
    public static void main(String[] args){
       Cell cell = new Cell();
        Map<Type, Set<Bio>> cellOne = cell.creatingCell();
        for (var type: TypeSpeedMaxPopulationWeightSaturation.TYPE_SPEED_MAX_POPULATION_WEIGHT_SATURATION.keySet()){
            System.out.println(type.getSimpleName() + " " + cellOne.get(type).size());
            System.out.printf("%s weight %d%n",type.getSimpleName(), TypeSpeedMaxPopulationWeightSaturation.TYPE_SPEED_MAX_POPULATION_WEIGHT_SATURATION.get(type)[2]);
            }
        Eat eat = new Eat();
        eat.eating(cellOne);

        for (var type: TypeSpeedMaxPopulationWeightSaturation.TYPE_SPEED_MAX_POPULATION_WEIGHT_SATURATION.keySet()){
            System.out.println(type.getSimpleName() + " " + cellOne.get(type).size());
            int i =0;
            for(var animal: cellOne.get(type)){
                System.out.printf("%s%d weight %d%n",animal.getClass().getSimpleName(), i++, animal.getWeight() );
            }
        }
    }
}