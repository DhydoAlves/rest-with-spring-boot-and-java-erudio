package br.com.erudio.utils;

import br.com.erudio.Exception.UnsupportedMathOperationException;

public class MathUtils {

    public static Double convertToDouble(String strNumber) throws IllegalArgumentException {

        if (strNumber == null || strNumber.isEmpty())
            throw new UnsupportedMathOperationException("Please correct it for me and enter a numeric value.");
        String number = strNumber.replace(",", ".");
        return Double.parseDouble(number);

    }
    public static boolean isNumeric(String strNumber) {
        if (strNumber == null || strNumber.isEmpty()) return false;
        String number = strNumber.replace(",", ".");// R$ 5,00  USD 5.00
        return number.matches("[-+]?\\d+\\.?\\d*|[-+]?\\.\\d+");

    }
//
}
