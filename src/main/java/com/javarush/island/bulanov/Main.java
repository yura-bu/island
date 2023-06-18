package com.javarush.island.bulanov;

import com.javarush.island.bulanov.threads.Day;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;


public class Main{
    public static void main(String[] args) throws InterruptedException{

        try (ScheduledExecutorService executorService = Executors.newScheduledThreadPool(8)) {
            executorService.scheduleWithFixedDelay(new Day(), 1, 1, TimeUnit.SECONDS);
            Thread.sleep(10000);

        }


    }
}