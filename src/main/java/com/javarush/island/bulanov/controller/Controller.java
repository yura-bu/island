package com.javarush.island.bulanov.controller;

import com.javarush.island.bulanov.map.Island;
import com.javarush.island.bulanov.threads.Day;
import com.javarush.island.bulanov.view.ViewConsole;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Controller{
    Island island;
    ViewConsole view;
    public Controller(ViewConsole view, Island island){
        this.island = island;
        this.view = view;
    }
    public void start(){
        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(4);
        executorService.scheduleWithFixedDelay(new Day(view, island), 1, 1, TimeUnit.SECONDS);
        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        executorService.shutdownNow();
    }
}
