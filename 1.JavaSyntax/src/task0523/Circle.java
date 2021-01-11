package com.javarush.task.task05.task0523;

/* 
Конструктор

Разбор чужого кода и поиск ошибок — как вам это нравится?.. Каков бы ни был ответ на этот вопрос, без этого не обойтись,
 и лучший способ выжить в программистском мире — полюбить это делать. Итак, вот вам программа, разберитесь, что она
 делает, найдите и исправьте ошибку. При этом метод main остается неприкосновенным, неизменным.

 Разберись, что делает программа.
Найди и исправь одну ошибку в классе Circle. Метод main изменять нельзя.


Требования:
1. Программа не должна считывать данные с клавиатуры.
2. Метод main изменять нельзя.
3. Программа должна вывести слово "Red" на экран.
4. Метод getDescription класса Color должен возвращать значение переменной description.
5. Метод setDescription класса Color должен устанавливать значение переменной description.
*/

public class Circle {
    public Color color;

    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.color.setDescription("Red");
        System.out.println(circle.color.getDescription());
    }

    public Circle() {
        color = new Color();
    }

    public class Color {
        String description;

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }
    }
}