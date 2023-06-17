package com.javarush.island.bulanov.map;

import com.javarush.island.bulanov.map.locations.Cell;

public class Island{
    private static Island island;
    public static Island getIsland(){
        if (island == null){
            synchronized (Island.class){
                island = new Island();
            }
        }
        return island;
    }

    public Cell[][] getLocations(){
        return locations;
    }
    private final Cell[][] locations = new Cell[2][2];
    private Island(){
        createIsland();
    }
    private void createIsland(){
        for (int i = 0; i < locations.length; i++) {
            for (int j = 0; j < locations[i].length; j++) {
                locations[i][j] = new Cell();
            }
        }
    }
}
