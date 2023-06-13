package com.javarush.island.bulanov.constants;

import com.javarush.island.bulanov.animals.Plant;
import com.javarush.island.bulanov.animals.herbivorous.*;
import com.javarush.island.bulanov.animals.predator.*;
import java.util.HashMap;
import java.util.Map;
/*  Integer[0] - Скорость перемещения, не более чем, клеток за ход,
    Integer[1] - Максимальное количество животных этого вида на одной клетке.
 */
public class TypeSpeedMaxPopulation{
    public static final Map<Class, Integer[]> typeSpeedMaxPopulation = new HashMap<>(){{
        put(Wolf.class, new Integer[]{3, 30});
        put(BoaConstrictor.class, new Integer[]{1, 30});
        put(Fox.class, new Integer[]{2, 30});
        put(Bear.class, new Integer[]{2, 5});
        put(Eagle.class, new Integer[]{3, 20});
        put(Horse.class, new Integer[]{4, 20});
        put(Deer.class, new Integer[]{4, 20});
        put(Rabbit.class, new Integer[]{2, 150});
        put(Mouse.class, new Integer[]{1,500});
        put(Goat.class, new Integer[]{3, 140});
        put(Sheep.class, new Integer[]{3, 140});
        put(WildBoar.class, new Integer[]{2, 50});
        put(Buffalo.class, new Integer[]{3, 10});
        put(Duck.class, new Integer[]{4, 200});
        put(Caterpillar.class, new Integer[]{0, 1000});
        put(Plant.class, new Integer[]{0, 200});
    }};
}
