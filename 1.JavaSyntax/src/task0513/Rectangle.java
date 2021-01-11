package com.javarush.task.task05.task0513;

/* 
Собираем прямоугольник

Компания OKEA продает космические челноки в разобранном виде. Все они имеют прямоугольную форму (мы не знаем, почему).
Эти ребята заказали у компании ИКС программу для автоматического составления инструкций челноков. Вам поручили создать
класс прямоугольник и инициализирующие методы на все случаи жизни.

Собираем прямоугольник
Создать класс прямоугольник (Rectangle). Его данными будут top, left, width, height (верхняя координата, левая, ширина
и высота).
Создать для него как можно больше методов initialize(...)

Примеры:
- заданы 4 параметра: left, top, width, height
- ширина/высота не задана (оба равны 0)
- высота не задана (равно ширине) создаём квадрат
- создаём копию другого прямоугольника (он и передаётся в параметрах)


Требования:
1. Программа не должна считывать данные с клавиатуры.
2. У класса Rectangle должны быть переменные top, left, width и height с типом int.
3. У класса должен быть хотя бы один метод initialize.
4. У класса должно быть хотя бы два метода initialize.
5. У класса должно быть хотя бы три метода initialize.
6. У класса должно быть хотя бы четыре метода initialize.
*/

public class Rectangle {
    int left = 0;
    int top = 0;
    int width = 0;
    int height = width;

    public void initialize(int leftRectangle){
        this.left = leftRectangle;
    }

    public void initialize(int leftRectangle, int topRectangle){
        this.left = leftRectangle;
        this.top = topRectangle;
    }

    public void initialize(int leftRectangle, int topRectangle, int widthRectangle){
        this.left = leftRectangle;
        this.top = topRectangle;
        this.width = widthRectangle;
    }

    public void initialize(int leftRectangle, int topRectangle, int widthRectangle, int heightRectangle){
        this.left = leftRectangle;
        this.top = topRectangle;
        this.width = widthRectangle;
        this.height = heightRectangle;
    }

    public static void main(String[] args) {

    }
}
