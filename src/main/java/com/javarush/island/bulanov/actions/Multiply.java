package com.javarush.island.bulanov.actions;

import com.javarush.island.bulanov.animals.Bio;
import com.javarush.island.bulanov.map.locations.Cell;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;

public class Multiply{
    public static synchronized void multiplying(Cell cellOne){
        ConcurrentMap<Class, Set<Bio>> cell = cellOne.cell;
        int numberOfPairs = 0;
        for(var type: cell.keySet()){
            if(!type.getSimpleName().equals("Plant") && !cell.get(type).isEmpty()){
                numberOfPairs = cell.get(type).size()/2;
                if(numberOfPairs != 0){
                    Set<Bio> animals = cell.get(type);
                    for (int i = 0; i < numberOfPairs; i++) {
//                        animals.addAll(new BirthOfLiving(type, cell.get(type).))
                    }

                }
            }
        }
    }
}
