package com.javarush.island.bulanov;

import com.javarush.island.bulanov.animals.predator.Bear;
import com.javarush.island.bulanov.animals.predator.Wolf;

public class Main{
    public static void main(String[] args){
        Wolf wolf = new Wolf();
        Bear bear = new Bear();
        System.out.println(bear.getWeight() + " Bear");
        System.out.println(wolf.getWeight());
        wolf.setWeight(wolf.getWeight()-20);
        System.out.println(wolf.getWeight());
    }
}