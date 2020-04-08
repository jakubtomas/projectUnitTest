package com.company;

public class Information {

    // return String binarn value

    /**
     * @param x   input number
     * @return String binary
     * @author Jakub tomas
     * @date 19.2.2020
     * @description
     */

    /// 232 666  789    225
    public String convertToBinary(int x) {

        String binary = "";
        while (x > 0) {
            binary = ((x % 2) == 0 ? "0" : "1") + binary;
            x = x / 2;
        }
        return binary;
    }

    public String sum(String a , String b) {
        // nekonecne cislo
        // može pozostavat iba 0 az 9
        // ziadny iny znak medzera znamienko

        if (a == null || b == null) {
            return null;
        }


        if (a.equals("") || b.equals("")) {
            return null;
        }

        for (int i = 0; i <a.length() ; i++) {

            if (a.charAt(i) > 47 && a.charAt(i) < 58) {
                //System.out.println("okey");
            } else {
               // System.out.println("bad value ");
                return null;
            }

        }

        for (int i = 0; i <b.length() ; i++) {

            if (b.charAt(i) > 47 && b.charAt(i) < 58) {
               // System.out.println("okey");
            } else {
                //System.out.println("bad value ");
                return null;
            }

        }


        // Before proceeding further, make sure length
        // of b is larger.
        if (a.length() > b.length()){
            String t = a;
            a = b;
            b = t;
        }

        // Take an empty String for storing result
        String str = "";

        // Calculate length of both String
        int n1 = a.length(), n2 = b.length();

        // Reverse both of Strings
        a=new StringBuilder(a).reverse().toString();
        b=new StringBuilder(b).reverse().toString();

        int carry = 0;
        for (int i = 0; i < n1; i++)
        {
            // Do school mathematics, compute sum of
            // current digits and carry
            int sum = ((int)(a.charAt(i) - '0') +
                    (int)(b.charAt(i) - '0') + carry);
            str += (char)(sum % 10 + '0');

            // Calculate carry for next step
            carry = sum / 10;
        }

        // Add remaining digits of larger number
        for (int i = n1; i < n2; i++)
        {
            int sum = ((int)(b.charAt(i) - '0') + carry);
            str += (char)(sum % 10 + '0');
            carry = sum / 10;
        }

        // Add remaining carry
        if (carry > 0)
            str += (char)(carry + '0');

        // reverse resultant String
        str = new StringBuilder(str).reverse().toString();

        return str;
    }



}
