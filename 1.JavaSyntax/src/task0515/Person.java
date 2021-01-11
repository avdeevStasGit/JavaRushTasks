package com.javarush.task.task05.task0515;

/* 
Инициализируем объекты так, как нам нужно! В этой задаче кто-то уже успел создать класс Person,
но нас такая реализация не вполне устраивает. Кое-что придется подправить: нам нужно переписать
программу так, чтобы один и только один метод initialize инициализировал все переменные класса Person.

Инициализация объектов
Изучи внимательно класс Person.
Исправь класс так, чтобы только один метод initialize инициализировал все переменные класса Person.


Требования:
1. Программа не должна считывать данные с клавиатуры.
2. У класса Person должно быть 5 переменных.
3. У класса должен быть один метод initialize.
4. Метод initialize должен иметь пять параметров.
*/

public class Person {
    String name;
    char sex;
    int money;
    int weight;
    double size;


    public void initialize(String name, char sex, int money, int weight, double size) {
        this.name = name;
        this.money = money;
        this.sex = sex;
        this.weight = weight;
        this.size = size;
    }

    public static void main(String[] args) {

    }
}
