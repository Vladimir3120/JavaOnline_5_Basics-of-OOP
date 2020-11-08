package com.epam.training.task05.contain;

import com.epam.training.task05.domain.Productable;

import java.util.List;

public enum TypeOfBox implements Productable {

    LITTLE_BOX("little box", 0.5), MIDDLE_BOX("middle box", 2.2), MAXI_BOX("maxi box", 4);

    TypeOfBox(String name, double price) {
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
