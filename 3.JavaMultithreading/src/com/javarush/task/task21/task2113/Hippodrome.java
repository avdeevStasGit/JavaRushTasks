package com.javarush.task.task21.task2113;

import java.util.ArrayList;
import java.util.List;

public class Hippodrome {

    public static Hippodrome game;
    private List<Horse> horses;

    public Hippodrome(List<Horse> horses) {

        this.horses = horses;
    }

    public List<Horse> getHorses() {
        return horses;
    }

    public static void main(String[] args) {

        ArrayList<Horse> horses = new ArrayList<Horse>();
        horses.add(new Horse("Бампер",3, 0));
        horses.add(new Horse("Руно", 3, 0));
        horses.add(new Horse("Рено", 3, 0));

        game = new Hippodrome(horses);

    }
}
