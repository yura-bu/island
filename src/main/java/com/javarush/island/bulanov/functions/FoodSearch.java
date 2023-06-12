package com.javarush.island.bulanov.functions;

import com.javarush.island.bulanov.animals.Animal;
import com.javarush.island.bulanov.animals.Bio;
import com.javarush.island.bulanov.constants.ProbabilityOfEating;

import java.util.concurrent.ThreadLocalRandom;

public class FoodSearch{
    public static void foodSearch(Bio obj1, Bio obj2){
        int random = ThreadLocalRandom.current().nextInt(1,101);
        int probability = ProbabilityOfEating.probability.get(obj1.getClass()).get(obj2.getClass());
        System.out.printf("Вероятность %s съесть %s равна %d%n", obj1.getClass().getSimpleName(), obj2.getClass().getSimpleName(), probability );
        if(random <= probability){
            System.out.println(obj1.getClass().getSimpleName() + " eat " + obj2.getClass().getSimpleName());
            ((Animal)obj1).eat(obj2);

        }
    }
}
