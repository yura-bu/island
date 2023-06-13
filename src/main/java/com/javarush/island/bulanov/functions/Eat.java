package com.javarush.island.bulanov.functions;

import com.javarush.island.bulanov.animals.Bio;

import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;

public class Eat{
    public void eating(Map<Type, Set<Bio>> cell){
        Set<Type> animalTypes = cell.keySet();
        Set<Type> animalFoodTypes = cell.keySet();
    }
}
