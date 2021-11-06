package com.javarush.task.pro.task03.task0302;

/**
 * Ввести с клавиатуры имя и возраст. Если возраст в пределах 18-28 (включительно),
 * то вывести надпись "Имя, явитесь в военкомат", где Имя - это имя, введенное ранее с клавиатуры.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Призывная кампания
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        String militaryCommissar = ", явитесь в военкомат";

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        int age = Integer.parseInt(reader.readLine());

        if(age >= 18 && age <= 28) {
                System.out.println(name + militaryCommissar);
        }
    }
}
