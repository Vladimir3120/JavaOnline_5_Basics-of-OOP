package com.epam.training.task05.domain;

import java.util.List;

public interface Productable<T> {

    String getName();

    double getPrice();

    List<T> getList();

}
