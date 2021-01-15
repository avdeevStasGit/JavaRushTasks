package com.javarush.task.task15.Singleton2;

public class Sun implements Planet {

    private volatile static Sun instance = null;

    private Sun() {

    }

    public static Sun getInstance() {
        if  (instance == null) {
            synchronized(Sun.class) {
                if (instance == null) {
                    instance = new Sun();
                }
            }
        }

        return instance;
    }

}
