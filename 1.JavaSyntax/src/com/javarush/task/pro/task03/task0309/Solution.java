package com.javarush.task.pro.task03.task0309;

/**
 * У нас есть программа, которая считывает с клавиатуры два числа и выводит на экран
 * большее из них. Если числа одинаковые, то выводится любое.
 * Перепиши программу с использованием тернарного оператора, чтобы ее функционал остался без изменений.
 */

import java.util.Scanner;

/* 
Ищем максимум
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberA = scanner.nextInt();
        int numberB = scanner.nextInt();
        if (numberA > numberB) {
            System.out.println(numberA);
        } else {
            System.out.println(numberB);
        }
    }
}
