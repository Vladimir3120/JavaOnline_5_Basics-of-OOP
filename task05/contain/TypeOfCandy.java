package com.epam.training.task05.contain;

import com.epam.training.task05.domain.Productable;

import java.util.List;

public enum TypeOfCandy implements  Productable {

    CHOCOLATE("chocolate", 10), CAKE("cake", 3), CANDY("candy", 1);

    TypeOfCandy(String name, double price) {
        this.name = name;
        this.price = price;
    }

    private String name;
    private double price;

    public String getName() {
        return name;
    }


    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public List getList() {
        return null;
    }


}
