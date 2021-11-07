package com.javarush.task.pro.task03.task0314;

/**
 * Амиго создал секретное слово для доступа к закрытой информации, но у него сломалась клавиатура,
 * и теперь невозможно набирать буквы в верхнем регистре. Напиши программу, которая будет сравнивать
 * введенную строку со строкой из переменной secret, не учитывая регистр.
 * Если введенная строка равна строке из переменной secret, программа выводит на экран
 * сообщение "доступ разрешен". В ином случае - "доступ запрещен".
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Сломанная клавиатура
*/

public class Solution {
    public static String secret = "AmIGo";

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            String inSecret = reader.readLine();

            if(inSecret.equalsIgnoreCase(secret))
                System.out.println("доступ разрешен");
            else {
                System.out.println("доступ запрещен");
            }
        }
        catch(IOException e) {
            System.out.println("Ошибка");
        }

    }
}
