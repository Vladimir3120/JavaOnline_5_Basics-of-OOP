package com.epam.training.task05.factory;

import com.epam.training.task05.domain.Product;
import com.epam.training.task05.domain.ProductType;
import com.epam.training.task05.domain.Productable;

public interface ProductFactory <T extends Product> {
    T createProduct(ProductType productType, Productable productable);
}
