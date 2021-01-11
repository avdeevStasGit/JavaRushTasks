package com.javarush.task.task05.task0517;

/* 
Конструируем котиков

Создавайте валидных котов нестандартным для природы способом — с помощью конструкторов. Создаем класс Cat и прописываем
для него пять разных конструкторов. Самый простой конструктор содержит одно поле — имя. Следующий — имя и возраст, а к
третьему добавляем вес. А об остальных — читайте в условии задачи.

Создать класс Cat (кот) с пятью конструкторами:
- Имя,
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет, (имя, адрес и возраст - неизвестные. Кот - бездомный)
- вес, цвет, адрес (чужой домашний кот)

Задача конструктора - сделать объект валидным.
Например, если вес не известен, то нужно указать какой-нибудь средний вес.
Кот не может ничего не весить.
То же касательно возраста. А вот имени может и не быть (null). То же касается адреса: null.


Требования:
1. У класса Cat должна быть переменная name с типом String.
2. У класса Cat должна быть переменная age с типом int.
3. У класса Cat должна быть переменная weight с типом int.
4. У класса Cat должна быть переменная address с типом String.
5. У класса Cat должна быть переменная color с типом String.
6. У класса должен быть конструктор, принимающий в качестве параметра имя, но инициализирующий все переменные класса,
кроме адреса.
7. У класса должен быть конструктор, принимающий в качестве параметров имя, вес, возраст и инициализирующий все
переменные класса, кроме адреса.
8. У класса должен быть конструктор, принимающий в качестве параметров имя, возраст и инициализирующий все переменные
класса, кроме адреса.
9. У класса должен быть конструктор, принимающий в качестве параметров вес, цвет и инициализирующий все переменные
класса, кроме имени и адреса.
10. У класса должен быть конструктор, принимающий в качестве параметров вес, цвет, адрес и инициализирующий все
переменные класса, кроме имени.
*/

public class Cat {
    String name = null;
    int age = 12;
    int weight = 5;
    String address = null;
    String color = "Black";

    public Cat(String nameCat)
    {
        this.name = nameCat;
        this.age = age;
        this.weight = weight;
        this.address = address;
        this.color = color;
    }

    public Cat(String nameCat, int weightCat, int ageCat)
    {
        this.name = nameCat;
        this.age = ageCat;
        this.weight = weightCat;
        this.address = address;
        this.color = color;
    }

    public Cat(String nameCat, int ageCat)
    {
        this.name = nameCat;
        this.age = ageCat;
        this.weight = weight;
        this.address = address;
        this.color = color;
    }

    public Cat(int weightCat, String colorCat){
        this.name = name;
        this.age = age;
        this.weight = weightCat;
        this.address = address;
        this.color = colorCat;
    }

    public Cat(int weightCat, String colorCat, String addressCat)
    {
        this.name = name;
        this.age = age;
        this.weight = weightCat;
        this.address = addressCat;
        this.color = colorCat;
    }



    public static void main(String[] args) {

    }
}
