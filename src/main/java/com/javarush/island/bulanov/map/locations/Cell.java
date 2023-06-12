package com.javarush.island.bulanov.map.locations;

import com.javarush.island.bulanov.animals.Bio;
import com.javarush.island.bulanov.animals.Plant;
import com.javarush.island.bulanov.animals.herbivorous.*;
import com.javarush.island.bulanov.animals.predator.*;
import com.javarush.island.bulanov.constants.MaxNumberOfAnimalsOnCage;
import com.javarush.island.bulanov.functions.BirthOfLiving;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Cell{
    public Map<Type, Set<Bio>> creatingCell(){
        Map<Type, Set<Bio>> cell = new HashMap<>();
        cell.put(Wolf.class, new BirthOfLiving().birthOfLiving(Wolf.class, MaxNumberOfAnimalsOnCage.MAX_ON_CAGE_WOOLF));
        cell.put(Fox.class, new BirthOfLiving().birthOfLiving(Fox.class, MaxNumberOfAnimalsOnCage.MAX_ON_CAGE_FOX));
        cell.put(Eagle.class, new BirthOfLiving().birthOfLiving(Eagle.class, MaxNumberOfAnimalsOnCage.MAX_ON_CAGE_EAGLE));
        cell.put(BoaConstrictor.class, new BirthOfLiving().birthOfLiving(BoaConstrictor.class, MaxNumberOfAnimalsOnCage.MAX_ON_CAGE_CONSTRICTOR));
        cell.put(Bear.class, new BirthOfLiving().birthOfLiving(Bear.class, MaxNumberOfAnimalsOnCage.MAX_ON_CAGE_BEAR));
        cell.put(Buffalo.class, new BirthOfLiving().birthOfLiving(Buffalo.class, MaxNumberOfAnimalsOnCage.MAX_ON_CAGE_BUFFALO));
        cell.put(Caterpillar.class, new BirthOfLiving().birthOfLiving(Caterpillar.class, MaxNumberOfAnimalsOnCage.MAX_ON_CAGE_CATERPILLAR));
        cell.put(Deer.class, new BirthOfLiving().birthOfLiving(Deer.class, MaxNumberOfAnimalsOnCage.MAX_ON_CAGE_DEER));
        cell.put(Duck.class, new BirthOfLiving().birthOfLiving(Duck.class, MaxNumberOfAnimalsOnCage.MAX_ON_CAGE_DUCK));
        cell.put(Goat.class, new BirthOfLiving().birthOfLiving(Goat.class, MaxNumberOfAnimalsOnCage.MAX_ON_CAGE_GOAT));
        cell.put(Horse.class, new BirthOfLiving().birthOfLiving(Horse.class, MaxNumberOfAnimalsOnCage.MAX_ON_CAGE_HORSE));
        cell.put(Mouse.class, new BirthOfLiving().birthOfLiving(Mouse.class, MaxNumberOfAnimalsOnCage.MAX_ON_CAGE_MOUSE));
        cell.put(Rabbit.class, new BirthOfLiving().birthOfLiving(Rabbit.class, MaxNumberOfAnimalsOnCage.MAX_ON_CAGE_RABBIT));
        cell.put(Sheep.class, new BirthOfLiving().birthOfLiving(Sheep.class, MaxNumberOfAnimalsOnCage.MAX_ON_CAGE_SHEEP));
        cell.put(WildBoar.class, new BirthOfLiving().birthOfLiving(WildBoar.class, MaxNumberOfAnimalsOnCage.MAX_ON_CAGE_WILD_BOAR));
        cell.put(Plant.class, new BirthOfLiving().birthOfLiving(Plant.class, MaxNumberOfAnimalsOnCage.MAX_ON_CAGE_PLANT));

        return cell;
    }
}
