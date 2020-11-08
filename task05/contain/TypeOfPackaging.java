package com.epam.training.task05.contain;

import com.epam.training.task05.domain.Productable;

import java.util.List;

public enum TypeOfPackaging implements Productable {

    PAPER("paper", 0.2), LINEN("linen", 0.9), DECORATIVE_FOIL("decorative foil", 0.4);

    TypeOfPackaging(String name, double price) {
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
