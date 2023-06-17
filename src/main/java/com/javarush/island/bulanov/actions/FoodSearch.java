package com.javarush.island.bulanov.actions;

import com.javarush.island.bulanov.animals.Animal;
import com.javarush.island.bulanov.animals.Bio;
import com.javarush.island.bulanov.constants.ProbabilityOfEating;

import java.util.concurrent.ThreadLocalRandom;

public class FoodSearch{
    public static boolean flag;
    public static boolean iAteIt;
    public static void foodSearch(Bio obj1, Bio obj2){

        int random = ThreadLocalRandom.current().nextInt(1,101);
        int probability = ProbabilityOfEating.probabilityOfEating.get(obj1.getClass()).get(obj2.getClass());
        if(random <= probability){
            flag = ((Animal)obj1).eat(obj2);
        }
    }
}
