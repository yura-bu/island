package com.javarush.island.bulanov;



import com.javarush.island.bulanov.threads.ThreadDay;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main{
    public static void main(String[] args) throws InterruptedException{

        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(4);
        executorService.scheduleWithFixedDelay(new ThreadDay(), 1, 1, TimeUnit.SECONDS);
        Thread.sleep(20000);

        executorService.shutdownNow();


    }
}