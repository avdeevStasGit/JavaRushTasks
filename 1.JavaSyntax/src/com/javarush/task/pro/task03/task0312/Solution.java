package com.javarush.task.pro.task03.task0312;

/**
 * Напиши программу, которая считывает с клавиатуры две строки и выдает сообщение о том, одинаковые ли эти строки.
 */


import java.util.Scanner;

/* 
Сравним строки
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();

        if(str1.equals(str2)) {
            System.out.println("строки одинаковые");
        }
        else {
            System.out.println("строки разные");
        }
        scanner.close();
    }
}
