package com.epam.training.task05.factory;

import com.epam.training.task05.domain.ProductType;
import com.epam.training.task05.domain.ProductType1;
import com.epam.training.task05.domain.Productable;

public class ProductType1Factory implements ProductFactory<ProductType1> {
    @Override
    public ProductType1 createProduct(ProductType productType, Productable productable) {
        return new ProductType1(productType, productable);
    }
}
