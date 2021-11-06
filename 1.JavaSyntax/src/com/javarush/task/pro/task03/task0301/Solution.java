package com.javarush.task.pro.task03.task0301;
/**
Ввести с клавиатуры температуру на улице. Если температура меньше 0, вывести надпись "на улице холодно",
 иначе - вывести надпись "на улице тепло".
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Тепло или холодно
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        String cold = "на улице холодно";
        String warm = "на улице тепло";

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String text = reader.readLine();
        int temp = Integer.parseInt(text);

        if(temp < 0) {
            System.out.println(cold);
        }
        else if(temp >= 0) {
            System.out.println(warm);
        }

    }
}
