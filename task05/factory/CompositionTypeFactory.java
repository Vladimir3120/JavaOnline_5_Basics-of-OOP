package com.epam.training.task05.factory;

import com.epam.training.task05.domain.Product;
import com.epam.training.task05.domain.ProductType;
import com.epam.training.task05.domain.ProductType2;

import java.util.List;

public class CompositionTypeFactory implements CompositionFactory<ProductType2> {
    @Override
    public ProductType2 createComposition(ProductType productType, List<Product> list, Product product) {
        return new ProductType2(productType, list, product);
    }
}
