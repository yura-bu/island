package com.javarush.island.bulanov.threads;

import com.javarush.island.bulanov.actions.Eat;
import com.javarush.island.bulanov.actions.Multiply;
import com.javarush.island.bulanov.map.Island;



public class ThreadZone implements Runnable{
    Island island = Island.getIsland();
    int i;
    public ThreadZone(int i){
        this.i = i;
    }

    @Override
    public void run(){

        for (int j = 0; j < island.getLocations()[i].length; j++) {
            Eat.eating(island.getLocations()[i][j]);
            Eat.starvedToDeath(island.getLocations()[i][j].cell);
            Multiply.multiplying(island.getLocations()[i][j]);
        }
    }
}
