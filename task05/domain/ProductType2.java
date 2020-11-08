package com.epam.training.task05.domain;

import java.util.List;

public class ProductType2 extends Product {

    private List<Product> list;
    private Product product;
    private String name;

    public ProductType2(ProductType productType, List<Product> list, Product product) {
        super(productType);
        this.list = list;
        this.product = product;
        this.name = productType.name();
    }

    @Override
    public List<Product> getList() {
        return list;
    }


    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        int sum = 0;

        for (Product product : list) {
            sum += product.getPrice();
        }

        return sum + product.getPrice();
    }

    @Override
    public String toString() {
        return getName() + " = " + list +
                ", pack = " + product;
    }
}