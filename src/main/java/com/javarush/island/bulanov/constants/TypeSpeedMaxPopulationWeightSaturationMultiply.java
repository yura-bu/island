package com.javarush.island.bulanov.constants;

import com.javarush.island.bulanov.animals.Plant;
import com.javarush.island.bulanov.animals.herbivorous.*;
import com.javarush.island.bulanov.animals.predator.*;
import java.util.HashMap;
import java.util.Map;
/*  Integer[0] - Скорость перемещения, не более чем, клеток за ход,
    Integer[1] - Максимальное количество животных этого вида на одной клетке.
    Integer[2] - Вес животного на момент создания в граммах,
    Integer[3] - Сколько граммов пищи нужно животному для полного насыщения,
    Integer[4] - количество потомков от одной пары
 */
public class TypeSpeedMaxPopulationWeightSaturationMultiply{
    public static final Map<Class, Integer[]> TYPE_SPEED_MAX_POPULATION_WEIGHT_SATURATION = new HashMap<>(){{
        put(Wolf.class, new Integer[]{3, 30, 50000, 8000, 3});
        put(BoaConstrictor.class, new Integer[]{1, 30, 15000, 3000, 1});
        put(Fox.class, new Integer[]{2, 30, 8000, 2000, 3});
        put(Bear.class, new Integer[]{2, 5, 500000, 80000, 3});
        put(Eagle.class, new Integer[]{3, 20, 6000, 1000, 4});
        put(Horse.class, new Integer[]{4, 20, 400000, 60000, 2});
        put(Deer.class, new Integer[]{4, 20, 300000, 50000, 2});
        put(Rabbit.class, new Integer[]{2, 150, 2000, 450, 5});
        put(Mouse.class, new Integer[]{1,500, 50, 10, 10});
        put(Goat.class, new Integer[]{3, 140, 60000, 10000, 2});
        put(Sheep.class, new Integer[]{3, 140, 70000, 15000, 2});
        put(WildBoar.class, new Integer[]{2, 50, 400000, 50000, 3});
        put(Buffalo.class, new Integer[]{3, 10, 700000, 100000, 1});
        put(Duck.class, new Integer[]{4, 200, 1000, 150, 4});
        put(Caterpillar.class, new Integer[]{0, 1000, 10, 1, 20});
        put(Plant.class, new Integer[]{0, 1000, 1000, 0, 1000});
    }};
}
