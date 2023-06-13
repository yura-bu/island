package com.javarush.island.bulanov;


import com.javarush.island.bulanov.animals.Bio;
import com.javarush.island.bulanov.animals.Plant;
import com.javarush.island.bulanov.animals.herbivorous.Caterpillar;
import com.javarush.island.bulanov.animals.herbivorous.Mouse;
import com.javarush.island.bulanov.animals.herbivorous.WildBoar;
import com.javarush.island.bulanov.animals.predator.*;
import com.javarush.island.bulanov.constants.TypeSpeedMaxPopulation;
import com.javarush.island.bulanov.functions.Eat;
import com.javarush.island.bulanov.map.locations.Cell;

import java.lang.reflect.Type;
import java.util.Map;
import java.util.Set;

public class Main{
    public static void main(String[] args){
       Cell cell = new Cell();
        Map<Type, Set<Bio>> cellOne = cell.creatingCell();

        Eat eat = new Eat();
        eat.eating(cellOne);

    }
}