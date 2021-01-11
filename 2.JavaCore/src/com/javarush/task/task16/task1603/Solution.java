package com.javarush.task.task16.task1603;

import java.util.ArrayList;
import java.util.List;


/* 
Список и нити
*/

public class Solution {
    public static volatile List<Thread> list = new ArrayList<Thread>(5);

    public static void main(String[] args) {

        SpecialThread computer = new SpecialThread();
        Thread thread1 = new Thread(computer);
        thread1.start();

        SpecialThread klava =  new SpecialThread();
        Thread thread2 = new Thread(klava);
        thread2.start();

        SpecialThread mouse = new SpecialThread();
        Thread thread3 = new Thread(mouse);
        thread3.start();
    }

    public static class SpecialThread implements Runnable {
        public void run() {
            System.out.println("it's a run method inside SpecialThread");
        }
    }
}
