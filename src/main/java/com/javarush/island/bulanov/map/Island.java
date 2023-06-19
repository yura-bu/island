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
    private final Cell[][] locations = new Cell[10][10];
    private Island(){
        createIsland();
    }
    private void createIsland(){
        for (int i = 0; i < locations.length; i++) {
            for (int j = 0; j < locations[i].length; j++) {
                locations[i][j] = new Cell();
            }
        }
        for (int i = 0; i < locations.length; i++) {
            for (int j = 0; j < locations[i].length; j++) {
                if(i != 0 && j != 0 && i != locations.length -1 && j != locations[i].length-1) {
                    locations[i][j].neighbors.add(locations[i - 1][j]);
                    locations[i][j].neighbors.add(locations[i][j + 1]);
                    locations[i][j].neighbors.add(locations[i + 1][j]);
                    locations[i][j].neighbors.add(locations[i][j - 1]);
                }else if(i == 0 && j != 0 && i != locations.length -1 && j != locations[i].length-1){
                    locations[i][j].neighbors.add(locations[i][j + 1]);
                    locations[i][j].neighbors.add(locations[i + 1][j]);
                    locations[i][j].neighbors.add(locations[i][j - 1]);
                }else if(i != 0 && j == 0 && i != locations.length -1 && j != locations[i].length-1){
                    locations[i][j].neighbors.add(locations[i - 1][j]);
                    locations[i][j].neighbors.add(locations[i][j + 1]);
                    locations[i][j].neighbors.add(locations[i + 1][j]);
                }else if(i != 0 && j != 0 && i == locations.length -1 && j != locations[i].length-1){
                    locations[i][j].neighbors.add(locations[i - 1][j]);
                    locations[i][j].neighbors.add(locations[i][j + 1]);
                    locations[i][j].neighbors.add(locations[i][j - 1]);
                }else if(i != 0 && j != 0 && i != locations.length -1 && j == locations[i].length-1) {
                    locations[i][j].neighbors.add(locations[i - 1][j]);
                    locations[i][j].neighbors.add(locations[i + 1][j]);
                    locations[i][j].neighbors.add(locations[i][j - 1]);
                }
            }
        }
        locations[0][0].neighbors.add(locations[0][1]);
        locations[0][0].neighbors.add(locations[1][0]);
        locations[0][locations[0].length-1].neighbors.add(locations[0][locations[0].length-2]);
        locations[0][locations[0].length-1].neighbors.add(locations[1][locations[0].length-1]);
        locations[locations.length -1][locations[locations.length -1].length-1].neighbors.add(locations[locations.length -2][locations[locations.length -2].length-1]);
        locations[locations.length -1][locations[locations.length -1].length-1].neighbors.add(locations[locations.length -1][locations[locations.length -1].length-2]);
        locations[locations.length -1][0].neighbors.add(locations[locations.length -2][0]);
        locations[locations.length -1][0].neighbors.add(locations[locations.length -1][1]);
    }
}
