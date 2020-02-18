package com.company;

public class Texto {


    // reverz textu  r

    public static String reverse(String inputText) {


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
}
