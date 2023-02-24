package com.reto.sistecredito.web.util;

import com.github.javafaker.Faker;

import java.util.Collections;

import static com.reto.sistecredito.web.util.Constants.RANDOM_NUMBER_CLASS;

public class RandomNumber {
    public static final Faker FAKER = new Faker();

    public static String generatRandomNumber() {
        return Integer.toString(FAKER.number().numberBetween(1, 5));
    }

    public static String generatRandomNumberMenu() {

        return Integer.toString(FAKER.number().numberBetween(2, 10));
    }
    private RandomNumber(){ throw new IllegalStateException(RANDOM_NUMBER_CLASS);}
}
