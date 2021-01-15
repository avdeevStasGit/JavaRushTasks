package com.javarush.task.task14.NOD;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
НОД
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());

        System.out.println(NOD(a, b));

    }

    private static int NOD(int a, int b) {

        if (a < 1 || b < 1) {
            throw new IllegalArgumentException();
        }
            while (b != 0) {
                int tmp = a % b;
                a = b;
                b = tmp;
            }
        return a;

    }

}
