package com.javarush.island.bulanov.functions;

import com.javarush.island.bulanov.animals.Bio;
import com.javarush.island.bulanov.fabric.BioFabric;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;
import java.util.random.RandomGenerator;

public class BirthOfLiving{
    public Set<Bio> birthOfLiving(Class clazz, int maxNumber){
        BioFabric fabric = new BioFabric();
        Set<Bio> animalSameType = new HashSet<>();
        int random = ThreadLocalRandom.current().nextInt(0, maxNumber+1);
        System.out.println(random);
        for (int i = 0; i < random; i++) {
            animalSameType.add(fabric.createAnimals(clazz.getSimpleName()));
        }
        return animalSameType;
    }

}
