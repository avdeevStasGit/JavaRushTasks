package com.javarush.task.task05.task0520;

/* 
Создать класс прямоугольник (Rectangle)

Прежде, чем создавать класс, нужно задуматься, для чего он нужен, и в связи с этим выбирать им соответствующие поля
и методы, прописывать конструкторы. Давайте создадим класс «прямоугольник» с полями «верхняя координата»,
«левая координата», высота, ширина. А затем определим для него как можно больше конструкторов.

Создать класс прямоугольник (Rectangle). Его данными будут top, left, width, height (верхняя координата, левая, ширина
и высота).
Создать для него как можно больше методов конструкторов.

Примеры:
- заданы 4 параметра: left, top, width, height
- ширина/высота не задана (оба равны 0)
- высота не задана (равно ширине) создаём квадрат
- создаём копию другого прямоугольника (он и передаётся в параметрах)


Требования:
1. У класса Rectangle должны быть переменные top, left, width и height с типом int.
2. У класса должен быть хотя бы один конструктор.
3. У класса должно быть хотя бы два конструктора.
4. У класса должно быть хотя бы три конструктора.
5. У класса должно быть хотя бы четыре конструктора.
*/


public class Rectangle {
    int left;
    int top;
    int width = 0;
    int height = width;

    public Rectangle(int leftRectangle)
    {
        this.left = leftRectangle;
    }

    public Rectangle(int leftRectangle, int topRectangle)
    {
        this.left = leftRectangle;
        this.top = topRectangle;
    }

    public Rectangle(int leftRectangle, int topRectangle, int widthRectangle)
    {
        this.left = leftRectangle;
        this.top = topRectangle;
        this.width = widthRectangle;
    }

    public Rectangle(int leftRectangle, int topRectangle, int widthRectangle, int heightRectangle)
    {
            this.left = leftRectangle;
            this.top = topRectangle;
            this.width = widthRectangle;
            this.height = heightRectangle;
    }


    public static void main(String[] args) {

    }
}
