package com.epam.training.task05.domain;

public abstract class Product implements Productable {

    private ProductType productType;

    public Product(ProductType productType) {
        this.productType = productType;
    }

    @Override
    public String toString() {
        return "" + productType;
    }
}
