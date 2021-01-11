package com.javarush.task.task05.task0519;

/* 
Ходим по кругу

Если нам нужна окружность для вычисления его длины, нам нужен её радиус, если для аналитической геометрии — радиус и
центр, ну а если мы хотим вывести её на экран, то желательно ещё и её цвет прописать. Это мы клоним к тому, что нам
нужно создать клас Circle и собрать для него три разных конструктора.

Создать класс (Circle) круг, с тремя конструкторами:
- centerX, centerY, radius
- centerX, centerY, radius, width
- centerX, centerY, radius, width, color


Требования:
1. У класса Circle должны быть переменные centerX, centerY, radius, width и color с типом int.
2. У класса должен быть конструктор, принимающий в качестве параметров centerX, centerY, radius и инициализирующий
соответствующие переменные класса.
3. У класса должен быть конструктор, принимающий в качестве параметров centerX, centerY, radius, width и
инициализирующий соответствующие переменные класса.
4. У класса должен быть конструктор, принимающий в качестве параметров centerX, centerY, radius, width, color и
инициализирующий соответствующие переменные класса.
*/

public class Circle {
    int centerX;
    int centerY;
    int radius;
    int width;
    int color;

    public Circle(int centerXCircle, int centerYCircle, int radiusCircle)
    {
        this.centerX = centerXCircle;
        this.centerY = centerYCircle;
        this.radius = radiusCircle;
    }

    public Circle(int centerXCircle, int centerYCircle, int radiusCircle, int widthCircle)
    {
        this.centerX = centerXCircle;
        this.centerY = centerYCircle;
        this.radius = radiusCircle;
        this.width = widthCircle;
    }

    public Circle(int centerXCircle, int centerYCircle, int radiusCircle, int widthCircle, int colorCircle)
    {
        this.centerX = centerXCircle;
        this.centerY = centerYCircle;
        this.radius = radiusCircle;
        this.width = widthCircle;
        this.color = colorCircle;
    }

    public static void main(String[] args) {

    }
}
