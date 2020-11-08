package com.epam.training.task05;

import com.epam.training.task05.contain.Contain;
import com.epam.training.task05.domain.*;

import static com.epam.training.task05.contain.TypeOfPackaging.*;
import static com.epam.training.task05.contain.TypeOfBox.*;
import static com.epam.training.task05.domain.ProductType.*;


public class Task05 {
    public static void main(String[] args) {

        int cuntA = 1;
        int countB = 2;
        int countC = 3;

        Contain contain = new Contain();

        Product gift = contain.composition(GIFT, LITTLE_BOX, GIFT, cuntA, countB, countC);
        System.out.println(gift + ", price = " + gift.getPrice());

        Product bouquet = contain.composition(BOUQUET, DECORATIVE_FOIL, FLOWER, cuntA, countB, countC);
        System.out.println(bouquet + ", price = " + bouquet.getPrice());
    }


}


