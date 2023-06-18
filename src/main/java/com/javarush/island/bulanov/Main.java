package com.javarush.island.bulanov;

import com.javarush.island.bulanov.controller.Controller;
import com.javarush.island.bulanov.map.Island;
import com.javarush.island.bulanov.view.ViewConsole;


public class Main{
    public static void main(String[] args) {
        Island island = Island.getIsland();
        ViewConsole viewConsole = new ViewConsole(island);
        Controller controller = new Controller(viewConsole, island);
        controller.start();



    }
}