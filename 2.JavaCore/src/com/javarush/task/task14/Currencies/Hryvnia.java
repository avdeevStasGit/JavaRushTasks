package com.javarush.task.task14.Currencies;

public class Hryvnia extends Money {

    public Hryvnia(double amount) {

        super(amount);
    }

    @Override
    public String getCurrencyName() {

        return "UAH";

    }
}
