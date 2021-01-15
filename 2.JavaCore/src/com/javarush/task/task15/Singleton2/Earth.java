package com.javarush.task.task15.Singleton2;

public class Earth implements Planet {

    private volatile static Earth instance = null;

    private Earth() {

    }

    public static Earth getInstance() {
        if  (instance == null) {
            synchronized(Earth.class) {
                if (instance == null) {
                    instance = new Earth();
                }
            }
        }

        return instance;
    }


}

