package com.javarush.task.task21.Hippodrome;

import java.util.ArrayList;
import java.util.List;

public class Hippodrome implements Runnable {

    public static Hippodrome game;
    private List<Horse> horses;

    public Hippodrome(List<Horse> horses) {

        this.horses = horses;
    }

    public List<Horse> getHorses() {
        return horses;
    }

    public void run() {

        int i = 1;
        while( i <= 100) {

            move();
            print();
            i++;
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void move() {

        for(Horse horse : horses) {
            horse.move();
        }

    }

    public void print() {

        for(Horse horse : horses) {
            horse.print();
        }

        for(int i = 0; i < 10; i++) {
            System.out.println();
        }
        
    }

    public static void main(String[] args) {

        ArrayList<Horse> horses = new ArrayList<Horse>();
        horses.add(new Horse("Бампер",3, 0));
        horses.add(new Horse("Руно", 3, 0));
        horses.add(new Horse("Рено", 3, 0));

        game = new Hippodrome(horses);
        Hippodrome.game.run();
    }
}
