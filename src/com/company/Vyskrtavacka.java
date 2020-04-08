package com.company;

import java.util.HashSet;
import java.util.Set;

public class Vyskrtavacka {
    private int cislo;  // clenska premenna

    // konstruktor
    public Vyskrtavacka(int cislo) {
        this.cislo=cislo;
    }

    public Set<Integer> generuj() {
        Set<Integer> set=new HashSet<>();   // mnaozina vysledkov

        int pocet=(int) Math.floor(Math.log10(cislo)); // pocet cifier
        pocet++;


        System.out.println("pocet " + pocet);
        System.out.println("Math.log10(number is )  "  + Math.log10(1040000));
        System.out.println("Math.floor(number is )  "  + Math.floor(Math.log10(715348)));

        //System.out.println("Pocet cifier:" + pocet);
        String data=Integer.toString(cislo);   // cislo zmenim na text, pr: 458 ->"458"

        //cyklus sa opakuje od 1 do pow(2,pocet)-1

                          //64-1 ´63
        for(int i=1; i < Math.pow(2,pocet)-1;i++){
            // pole 0 a 1, postupne do neho generujem cisla v binarnom kode
            // od 00...001 do 11...110   (vynechame 00000000 a 11111111 )
            String pole=Integer.toBinaryString(i);
            System.out.println("generovanie " + Integer.toBinaryString(i) +  " for " + i) ;
            int rozdiel=pocet-pole.length();

            System.out.println("pocet " + pocet+ " pole length  " + pole.length() );
            // ak je cislo v binarnom kode kratsie ako pocet bitov, doplnim zlava 0
            // priklad: pocet = 6, i = 11 : 1011 , tak doplnim dve nuly zlava 001011
            for(int j=0;j<rozdiel;j++){
                pole='0'+pole;
            }
            //System.out.println(pole);

            //vygenerovane cislo
            String value="";
            //porovnavam povodne cislo a kod 0 a 1
            // ak je v kode 1 to cislo pouzijem, ak 0 ignorujem
            for(int index=0;index<pocet;index++){
                if(pole.charAt(index)=='1'){
                    value=value+data.charAt(index);
                }
            }

            //sparsujem cislo ako text na format int a pridam do mnoziny
            Integer number=Integer.parseInt(value);
            set.add(number);

        }

        return set;
    }

    public static void main(String[] args) {
        Vyskrtavacka vyskrtavacka = new Vyskrtavacka(123456);
        System.out.println(vyskrtavacka.generuj());
    }

}

