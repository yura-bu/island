package com.javarush.island.bulanov;


import com.javarush.island.bulanov.animals.Bio;
import com.javarush.island.bulanov.animals.Plant;
import com.javarush.island.bulanov.animals.herbivorous.Caterpillar;
import com.javarush.island.bulanov.animals.herbivorous.Mouse;
import com.javarush.island.bulanov.animals.herbivorous.WildBoar;
import com.javarush.island.bulanov.animals.predator.*;
import com.javarush.island.bulanov.map.locations.Cell;

import java.lang.reflect.Type;
import java.util.Map;
import java.util.Set;

public class Main{
    public static void main(String[] args){
       Cell cell = new Cell();
        Map<Type, Set<Bio>> cellOne = cell.creatingCell();
        System.out.printf("Колличество %s = %d%n", Wolf.class.getSimpleName(), cellOne.get(Wolf.class).size());
        System.out.printf("Колличество %s = %d%n", Plant.class.getSimpleName(), cellOne.get(Plant.class).size());
        System.out.printf("Колличество %s = %d%n", Mouse.class.getSimpleName(), cellOne.get(Mouse.class).size());
        System.out.printf("Колличество %s = %d%n", Fox.class.getSimpleName(), cellOne.get(Fox.class).size());
        System.out.printf("Колличество %s = %d%n", Eagle.class.getSimpleName(), cellOne.get(Eagle.class).size());
        System.out.printf("Колличество %s = %d%n", BoaConstrictor.class.getSimpleName(), cellOne.get(BoaConstrictor.class).size());
        System.out.printf("Колличество %s = %d%n", Bear.class.getSimpleName(), cellOne.get(Bear.class).size());
        System.out.printf("Колличество %s = %d%n", WildBoar.class.getSimpleName(), cellOne.get(WildBoar.class).size());
        System.out.printf("Колличество %s = %d%n", Caterpillar.class.getSimpleName(), cellOne.get(Caterpillar.class).size());
    }
}