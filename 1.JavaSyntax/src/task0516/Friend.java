package com.javarush.task.task05.task0516;

/* 
Друзей не купишь

По-английски словосочетание «Make friends» (дословно «делать друзей») означает просто «подружиться», а не делать
кого-то. Очень конструктивно звучит, надо сказать. Переведем фразу с английского на Java: Создадим класс Friend с тремя
констукторами. В первом укажем имя, во втором добавим возраст, ну а в третьем еще и пол учтем.

Создать класс Friend (друг) с тремя конструкторами:
- Имя
- Имя, возраст
- Имя, возраст, пол


Требования:
1. У класса Friend должна быть переменная name с типом String.
2. У класса Friend должна быть переменная age с типом int.
3. У класса Friend должна быть переменная sex с типом char.
4. У класса должен быть конструктор, принимающий в качестве параметра имя и инициализирующий соответствующую переменную
класса.
5. У класса должен быть конструктор, принимающий в качестве параметров имя, возраст и инициализирующий соответствующие
переменные класса.
6. У класса должен быть конструктор, принимающий в качестве параметров имя, возраст, пол и инициализирующий
соответствующие переменные класса.
*/

public class Friend {
    private String name;
    private int age;
    private char sex;

    public Friend(String nameFriend)
    {
        this.name = nameFriend;
    }

    public Friend(String nameFriend, int ageFriend)
    {
        this.name = nameFriend;
        this.age = ageFriend;
    }

    public Friend(String nameFriend, int ageFriend, char sexFriend)
    {
        this.name = nameFriend;
        this.age = ageFriend;
        this.sex = sexFriend;
    }

    public static void main(String[] args) {

    }
}
