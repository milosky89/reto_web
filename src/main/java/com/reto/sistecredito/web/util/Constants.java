package com.reto.sistecredito.web.util;

import com.reto.sistecredito.web.models.Product;

import java.util.ArrayList;
import java.util.List;

public class Constants {
    public static final String USER_INTERFACE_CLASS = "user interface class";
    public static final String CONSTANT_CLASS = "constant class";
    public static final String RANDOM_NUMBER_CLASS = "Random number class";
    public static final String CONVERSIONS_CLASS = "class conversions";
    public static final String PRICE = "price";
    public static final String TOTAL_QUANTITY = "Total quantity";
    public static final String TOTAL_VALUE_PRODUCTS = "Total Value Products\n";
    public static final String DISCOUNT = "discount";

    public static List<Product> productList = new ArrayList<>();

    private Constants(){
        throw new IllegalStateException(CONSTANT_CLASS);
    }

}
