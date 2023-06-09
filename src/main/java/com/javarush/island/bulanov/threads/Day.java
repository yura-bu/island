package com.javarush.island.bulanov.threads;

import com.javarush.island.bulanov.map.Island;
import com.javarush.island.bulanov.view.ViewConsole;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class Day implements Runnable{

    Island island = Island.getIsland();
    public
    ViewConsole viewConsole = new ViewConsole(island);


    @Override
    public void run(){

        try (ExecutorService executorService = Executors.newFixedThreadPool(100)) {

            for (int i = 0; i < island.getLocations().length; i++) {
                executorService.execute(new ThreadZone(i));
            }
            viewConsole.print();

        }


    }
}
