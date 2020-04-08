/*
package com.company;

import fr.marcwrobel.jbanking.iban.Iban;

public class Texto {


    // reverz textu  r

    */
/**
     * @param inputText String word
     * @author  Jakub Tomas
     * @date 19.2.2020
     * @return String reverse opposite the reverse
     *//*

    public  String reverse(String inputText) {


        // getBytes() method to convert string
        // into bytes[].
        byte[] strAsByteArray = inputText.getBytes();

        byte[] result = new byte[strAsByteArray.length];

        // Store result in reverse order into the
        // result byte[]
        for (int i = 0; i < strAsByteArray.length; i++) {

            result[i] =
                    strAsByteArray[strAsByteArray.length - i - 1];
        }

        //System.out.println();

        return new String(result);
    }



    public  boolean CheckIban(String iban) {

        //IBANCheckDigit a = new IBANCheckDigit();



        int IBAN_MIN_SIZE = 15;
        int IBAN_MAX_SIZE = 34;
        long IBAN_MAX = 999999999;
        long IBAN_MODULUS = 97;

        String trimmed = iban.trim();

        if (trimmed.length() < IBAN_MIN_SIZE || trimmed.length() > IBAN_MAX_SIZE) {
            return false;
        }

        String reformat = trimmed.substring(4) + trimmed.substring(0, 4);
        long total = 0;

        for (int i = 0; i < reformat.length(); i++) {

            int charValue = Character.getNumericValue(reformat.charAt(i));

            if (charValue < 0 || charValue > 35) {
                return false;
            }

            total = (charValue > 9 ? total * 100 : total * 10) + charValue;

            if (total > IBAN_MAX) {
                total = (total % IBAN_MODULUS);
            }
        }

        return (total % IBAN_MODULUS) == 1;
    }



    public boolean checkI(String iban) {

        return  Iban.isValid(iban);
    }


}


*/
