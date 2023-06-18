package com.javarush.island.bulanov.threads;

import com.javarush.island.bulanov.map.Island;
import com.javarush.island.bulanov.view.ViewConsole;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class Day implements Runnable{

    Island island;
    public
    ViewConsole viewConsole;

    public Day(ViewConsole viewConsole, Island island){
        this.island = island;
        this.viewConsole = viewConsole;
    }
    @Override
    public void run(){
        ExecutorService executorService = Executors.newFixedThreadPool(100);

        for (int i = 0; i < island.getLocations().length; i++) {
            executorService.execute(new ThreadZone(i));
        }
        viewConsole.print();
        executorService.shutdownNow();

    }
}
