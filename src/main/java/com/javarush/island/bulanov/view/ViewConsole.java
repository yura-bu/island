package com.javarush.island.bulanov.view;

import com.javarush.island.bulanov.animals.Bio;
import com.javarush.island.bulanov.map.Island;
import java.util.Map;
import java.util.Set;
import static com.javarush.island.bulanov.constants.TextView.*;

public class ViewConsole{
    Island island;
    int d = 1;
    public ViewConsole(Island island){
        this.island = island;
    }
    private long revisionIsland(){
        long total = 0;
        for (int i = 0; i < island.getLocations().length; i++) {
            for (int j = 0; j < island.getLocations()[i].length; j++) {
               Map<Class, Set<Bio>> cellMap = island.getLocations()[i][j].cell;
                for(var type: cellMap.keySet()){
                    total = total + cellMap.get(type).size();
                }
            }
        }
        return total;
    }
    public void printDay(){
        long total = revisionIsland();
        System.out.printf("%s : %d%n",TOTAL_NUMBER_OF_LIVE, total);
    }
    public void print(){
        int k = 0;
        printDay();
        for (int i = 0; i < island.getLocations().length; i++) {
            for (int j = 0; j < island.getLocations()[i].length; j++) {
                System.out.println(UNDERLINING);
                System.out.printf("%s: %d%n",LOCATION, k++);
                System.out.println(UNDERLINING);
                Map<Class, Set<Bio>> cellMap = island.getLocations()[i][j].cell;
                for(var type: cellMap.keySet()){
                    System.out.println(type.getSimpleName() + " " + cellMap.get(type).size());
                }
            }
        }
        System.out.println(UNDERLINING);
        System.out.printf(DAY, d++);
        System.out.println(UNDERLINING);
    }

}
