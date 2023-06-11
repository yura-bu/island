package com.javarush.island.bulanov.map.locations;

import com.javarush.island.bulanov.animals.Bio;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Cell{
    public Map<Type, Set<Bio>> cell = new HashMap<>();
}
