package com.javarush.task.task15.Singleton2;

public class Moon implements Planet {

    private volatile static  Moon instance = null;

    private Moon() {

    }

    public static Moon getInstance() {
        if  (instance == null) {
            synchronized(Moon.class) {
                if (instance == null) {
                    instance = new Moon();
                }
            }
        }

        return instance;
    }

}
