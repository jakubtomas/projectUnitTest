package com.company;

public class Information {

    // return String binarn value


    public String convertToBinarn(int x) {

        String binary = "";
        while (x > 0) {
            binary = ((x % 2) == 0 ? "0" : "1") + binary;
            x = x / 2;
        }
        return binary;
    }


}
