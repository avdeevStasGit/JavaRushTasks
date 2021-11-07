package com.javarush.task.pro.task03.task0307;

/**
 * Напишем программу, которая будет считывать с клавиатуры возраст.
 * Если возраст от 20 до 60 (включительно), то выводить ничего не нужно,
 * иначе - вывести фразу "можно не работать". Сделать это можно (и нужно!)
 * с помощью только одного оператора if без else.
 */

import java.util.Scanner;

/* 
Работать или не работать - вот в чем вопрос
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if(age < 20 || age > 60)
            System.out.println("можно не работать");
    }
}
