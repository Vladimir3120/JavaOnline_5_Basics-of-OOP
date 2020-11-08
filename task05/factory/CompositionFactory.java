package com.epam.training.task05.factory;

import com.epam.training.task05.domain.Product;
import com.epam.training.task05.domain.ProductType;

import java.util.List;

public interface CompositionFactory <T extends Product> {
    T createComposition(ProductType productType, List<Product> list, Product product);
}
