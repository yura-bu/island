package com.javarush.island.bulanov;

import com.javarush.island.bulanov.animals.Plant;
import com.javarush.island.bulanov.animals.herbivorous.Buffalo;
import com.javarush.island.bulanov.animals.herbivorous.Horse;
import com.javarush.island.bulanov.animals.herbivorous.Mouse;
import com.javarush.island.bulanov.animals.herbivorous.Rabbit;
import com.javarush.island.bulanov.animals.predator.Bear;
import com.javarush.island.bulanov.animals.predator.Wolf;

public class Main{
    public static void main(String[] args){
        Wolf wolf = new Wolf();
        Bear bear = new Bear();
        Horse horse = new Horse();
        Buffalo buffalo = new Buffalo();
        Plant plant = new Plant();
        Mouse mouse = new Mouse();
        Rabbit rabbit = new Rabbit();

        wolf.toEat(bear);
        System.out.println(wolf.getWeight());
        wolf.toEat(mouse);
        System.out.println(wolf.getFoodForFullSaturation());
        wolf.toEat(rabbit);
        System.out.println(wolf.getFoodForFullSaturation());
        wolf.toEat(buffalo);
        System.out.println(wolf.getFoodForFullSaturation());
        System.out.println(wolf.getWeight());
        wolf.toEat(horse);
        System.out.println(wolf.getWeight());
        wolf.toEat(plant);


    }
}