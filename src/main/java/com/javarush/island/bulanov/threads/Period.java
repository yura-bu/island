package com.javarush.island.bulanov.threads;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Period{
    public static void play() throws InterruptedException{
        try (ScheduledExecutorService executorService = Executors.newScheduledThreadPool(8)) {
            executorService.scheduleWithFixedDelay(new Day(), 100, 100, TimeUnit.MILLISECONDS);
            Thread.sleep(30000);
        }
    }
}

