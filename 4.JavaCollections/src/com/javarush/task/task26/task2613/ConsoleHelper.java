package com.javarush.task.task26.task2613;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleHelper {
    private static BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
    
    //Будет писать в консоль наше сообщение.
    public static void writeMessage(String message) {
        System.out.println(message);
    }
    
    //Будет считывать с консоли строку и возвращать ее.
    public static String readString() {
        try {
            String readLine = bis.readLine();
            return readLine;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
