package br.com.brenomp.resource.converters;

public class NumberConvert {

    public static double convertToDouble(String strNumber) {

        if (strNumber == null && strNumber.isEmpty())
            throw new UnsupportedOperationException("Please set a numeric value");
        String number = strNumber.replace(",", ".");
        return Double.parseDouble(number);
    }
}
