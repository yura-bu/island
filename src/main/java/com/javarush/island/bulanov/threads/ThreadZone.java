package com.javarush.island.bulanov.threads;

import com.javarush.island.bulanov.actions.Eat;
import com.javarush.island.bulanov.actions.Move;
import com.javarush.island.bulanov.actions.Multiply;
import com.javarush.island.bulanov.map.Island;



public class ThreadZone implements Runnable{
    final Island island = Island.getIsland();
    int i;
    public ThreadZone(int i){
        this.i = i;
    }

    @Override
    public void run(){

        for (int j = 0; j < island.getLocations()[i].length; j++) {
            synchronized (island) {

                Eat.eating(island.getLocations()[i][j]);
                Eat.starvedToDeath(island.getLocations()[i][j].cell);
                Multiply.multiplying(island.getLocations()[i][j]);
                Move.moving(island.getLocations()[i][j]);
            }
        }
    }
}
