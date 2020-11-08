package com.epam.training.task05.domain;

import java.util.List;
import java.util.Objects;

public class ProductType1 extends Product {

    private Productable productable;

    public ProductType1(ProductType productType, Productable productable) {
        super(productType);
        this.productable = productable;
    }

    @Override
    public String getName() {
        return productable.getName();
    }

    @Override
    public double getPrice() {
        return productable.getPrice();
    }


    public List getList() {
        return null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductType1 that = (ProductType1) o;
        return Objects.equals(productable, that.productable);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productable);
    }

    @Override
    public String toString() {
        return "" + productable;
    }
}