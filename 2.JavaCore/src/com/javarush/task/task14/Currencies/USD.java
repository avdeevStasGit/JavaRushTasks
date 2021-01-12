package com.javarush.task.task14.Currencies;

public class USD extends Money {

    public USD(double amount) {

        super(amount);
    }

    @Override
    public String getCurrencyName() {

        return "USD";
    }
}
