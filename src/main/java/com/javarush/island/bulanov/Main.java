package com.javarush.island.bulanov;


import com.javarush.island.bulanov.animals.predator.Wolf;
import com.javarush.island.bulanov.fabric.BioFabric;

public class Main{
    public static void main(String[] args){
        BioFabric bioFabric= new BioFabric();
        System.out.println(((Wolf) bioFabric.createAnimals("Wolf")).getId());
        System.out.println(((Wolf) bioFabric.createAnimals("Wolf")).getId());
        System.out.println(((Wolf) bioFabric.createAnimals("Wolf")).getId());
    }
}