package com.javarush.task.pro.task03.task0304;

/**
 * Программа считывает с клавиатуры значение температуры тела и выдает сообщение о том,
 * что температура тела высокая, низкая или нормальная, в зависимости от условий.
 * В классе объявлены две булевые переменные isHigh (высокая температура) и isLow (низкая),
 * в которые нужно вынести соответствующие условия и вместо выражений сравнения использовать эти переменные.
 */

import java.util.Scanner;

/* 
Измерим температуру тела
*/

public class Solution {
    private static boolean isHigh;
    private static boolean isLow;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double bodyTemperature = scanner.nextDouble();

        if (bodyTemperature > 37) {
            System.out.println("температура тела высокая");
        } else if (bodyTemperature < 36){
            System.out.println("температура тела низкая");
        } else {
            System.out.println("температура тела нормальная");
        }
    }
}
