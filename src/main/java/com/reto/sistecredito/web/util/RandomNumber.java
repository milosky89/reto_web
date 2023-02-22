package com.reto.sistecredito.web.util;

import java.util.Collections;
import java.util.Random;

import static com.reto.sistecredito.web.util.Constants.RANDOM_NUMBER_CLASS;

public class RandomNumber {

    public static String generatRandomNumber(int longitud) {
        String number = String.join("", Collections.nCopies(longitud, "5"));
        return ((int) (Math.random() * (Integer.parseInt(number) - 1 + 1) + 1)) + "";}


    public static String generatRandomNumberMenu(int longitud) {
        String number = String.join("", Collections.nCopies(longitud, "9"));
        return ((int) (Math.random() * (Integer.parseInt(number) - 1 + 1) + 1)) + "";}
    private RandomNumber(){ throw new IllegalStateException(RANDOM_NUMBER_CLASS);}
}
