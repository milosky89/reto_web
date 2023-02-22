package com.reto.sistecredito.web.util;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

import static com.reto.sistecredito.web.util.Constants.CONVERSIONS_CLASS;

public class Convert {

    public static String valueFormat(String value) {
        value = value.replace(".0","");
        DecimalFormatSymbols character = new DecimalFormatSymbols();character.setDecimalSeparator(',');
        character.setGroupingSeparator('.');
        DecimalFormat numberFormat = new DecimalFormat("00,000", character);
        return numberFormat.format(Double.parseDouble(value));}

    private Convert(){
        throw new IllegalStateException(CONVERSIONS_CLASS);
    }
}
