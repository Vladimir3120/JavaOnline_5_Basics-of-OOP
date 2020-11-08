package com.epam.training.task05.contain;


import com.epam.training.task05.factory.CompositionTypeFactory;
import com.epam.training.task05.factory.ProductType1Factory;
import com.epam.training.task05.domain.Product;
import com.epam.training.task05.domain.ProductType;
import com.epam.training.task05.domain.Productable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.epam.training.task05.contain.TypeOfFlower.*;
import static com.epam.training.task05.contain.TypeOfCandy.*;

public class Contain {

    private static final int CONTAIN_MAP = 1;
    private List<Product> list;
    private Product pack;
    private Product composition;

    private List<Product> addProductToList(ProductType productType, Productable productable, int count) {
        List<Product> list = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            list.add(new ProductType1Factory().createProduct(productType, productable));
        }
        return list;
    }

    private Map<Integer, List<Product>> createMap(ProductType productType, int product1, int product2, int product3) {
        Map<Integer, List<Product>> map = new HashMap<>();
        for (int i = 0; i < CONTAIN_MAP; i++) {
            if (productType.name().equals(ProductType.FLOWER.name())) {
                ProductType type = ProductType.FLOWER;
                map.put(i++, addProductToList(type, ROSE, product1));
                map.put(i++, addProductToList(type, TULIP, product2));
                map.put(i++, addProductToList(type, CARNATION, product3));
            }
            if (productType.name().equals(ProductType.GIFT.name())) {
                ProductType type = ProductType.GIFT;
                map.put(i++, addProductToList(type, CAKE, product1));
                map.put(i++, addProductToList(type, CANDY, product2));
                map.put(i++, addProductToList(type, CHOCOLATE, product3));
            }
        }
        return map;
    }

    private Product pack(Productable productable) {
        return this.pack = new ProductType1Factory().createProduct(ProductType.PACKING, productable);
    }

    private List<Product> mapToList(Map<Integer, List<Product>> map) {
        List<Product> list = new ArrayList<>();
        for (Map.Entry<Integer, List<Product>> listEntry : map.entrySet()) {
            for (Product pr : listEntry.getValue()) {
                list.add(pr);
            }
        }
        return this.list = list;
    }

    public Product composition(ProductType typeOfCom, Productable typeOfPackaging, ProductType typeOfProduct, int a, int b, int c) {
        Product pack = pack(typeOfPackaging);
        Map<Integer, List<Product>> map = createMap(typeOfProduct, a, b, c);
        List<Product> products = mapToList(map);

        return this.composition = new CompositionTypeFactory().createComposition(typeOfCom, products, pack);
    }

}
