package com.javarush.island.bulanov.actions;

import com.javarush.island.bulanov.animals.Animal;
import com.javarush.island.bulanov.animals.Bio;
import com.javarush.island.bulanov.animals.Moving;
import com.javarush.island.bulanov.map.locations.Cell;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ThreadLocalRandom;

import static com.javarush.island.bulanov.constants.TypeSpeedMaxPopulationWeightSaturationMultiply.TYPE_SPEED_MAX_POPULATION_WEIGHT_SATURATION;

public class Move{
    public static synchronized void  moving(Cell cellOne){
        ConcurrentHashMap<Class, Set<Bio>> cell = cellOne.cell;
        int speed;
        int i = ThreadLocalRandom.current().nextInt(0, cellOne.neighbors.size());
        for(var type: cell.keySet()){
            Iterator<Bio> itr = cell.get(type).iterator();
            while (itr.hasNext()){
                Bio animal =  itr.next();
                if(animal instanceof Moving) {
                    speed = ThreadLocalRandom.current().nextInt(0, TYPE_SPEED_MAX_POPULATION_WEIGHT_SATURATION.get(type)[0]);
                    ((Animal) animal).setSpeedMoving(speed);
                    if(((Animal) animal).getSpeedMoving() != 0) {
                        ((Animal) animal).setSpeedMoving(((Animal) animal).getSpeedMoving()-1);
                        Cell neighborCell = cellOne.neighbors.get(i);
                        neighborCell.cell.get(type).add(animal);
                        itr.remove();
                    }
                }
            }
        }
    }
}
