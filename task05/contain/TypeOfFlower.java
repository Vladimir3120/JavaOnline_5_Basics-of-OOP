package com.epam.training.task05.contain;

import com.epam.training.task05.domain.Productable;

import java.util.List;

public enum TypeOfFlower implements Productable {
    ROSE("rose", 5), TULIP("tulip", 3.5), CARNATION("carnation", 2);

    TypeOfFlower(String name, double price) {
        this.price = price;
        this.name = name;
    }

    private double price;
    private String name;

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
