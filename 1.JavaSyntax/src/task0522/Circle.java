package com.javarush.task.task05.task0522;

/* 
Максимум конструкторов

Наставники секретного центра JavaRush постарались и подготовили для вас класс Окружность. Но эту окружность нужно
совершенстовать, и это уже ваша задача. Изучите класс Circle (окружность) и напишите максимальное количество
конструкторов с разными аргументами, не меняя сам класс. Ну и про конструктор по умолчанию не забудьте.

Изучи класс Circle. Напиши максимальное количество конструкторов с разными аргументами.


Требования:
1. У класса должно быть хотя бы три переменные.
2. У класса должен быть конструктор по умолчанию.
3. У класса должен быть хотя бы один конструктор.
4. У класса должно быть хотя бы два конструктора.
5. У класса должно быть хотя бы три конструктора.
6. У класса должно быть хотя бы четыре конструктора.
*/

public class Circle {
    public double x;
    public double y;
    public double radius;

    public Circle()
    {

    }

    public Circle(double xCircle)
    {
        this.x = xCircle;
    }

    public Circle(double xCircle, double yCircle)
    {
        this.x = xCircle;
        this.y = yCircle;
    }

    public Circle(double xCircle, double yCircle, double radiusCircle)
    {
        this.x = xCircle;
        this.y = yCircle;
        this.radius = radiusCircle;
    }




    public static void main(String[] args) {

    }
}