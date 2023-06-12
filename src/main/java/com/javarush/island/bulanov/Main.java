package com.javarush.island.bulanov;


import com.javarush.island.bulanov.animals.predator.Wolf;
import com.javarush.island.bulanov.constants.MaxNumberOfAnimalsOnCage;
import com.javarush.island.bulanov.functions.BirthOfLiving;

public class Main{
    public static void main(String[] args){
        BirthOfLiving birthOfLiving = new BirthOfLiving();
        System.out.println(birthOfLiving.birthOfLiving(Wolf.class, MaxNumberOfAnimalsOnCage.MAX_ON_CAGE_WOOLF));
    }
}