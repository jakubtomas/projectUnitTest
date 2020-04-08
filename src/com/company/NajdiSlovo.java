package com.company;



public class NajdiSlovo {

    private String slovo;

    private int hashCode;

    public NajdiSlovo(String slovo, int hashCode) {
        this.slovo = slovo;
        this.hashCode = hashCode;
    }


    public String najdiRiesenie() {
        String helpResult = "";
        boolean samenessValues = false;
        
        int pocet = this.slovo.length()-1;
        String helpword = "";


        // vytvorim rovnake slovo bez prveho pismenka
        for (int i = 1; i < pocet+1 ; i++) {
            helpword =helpword + slovo.charAt(i);
        }



        
        for(int i=1; i < Math.pow(2,pocet);i++){
            // pole 0 a 1, postupne do neho generujem cisla v binarnom kode
            // od 00...001 do 11...110   (vynechame 00000000 a 11111111 )
            String pole=Integer.toBinaryString(i);

            System.out.println("generovanie " + Integer.toBinaryString(i) +  " for " + i) ;
            int rozdiel=pocet-pole.length();
            // ak je cislo v binarnom kode kratsie ako pocet bitov, doplnim zlava 0
            // priklad: pocet = 6, i = 11 : 1011 , tak doplnim dve nuly zlava 001011
            for(int j=0;j<rozdiel;j++){
                pole='0'+pole;
            }
            System.out.println("array after repaired " +  pole);
            //System.out.println(pole);

            //vygenerovane cislo
            String resultWord= "";

            // pridam prve písmenko s inputu
            resultWord = resultWord + slovo.charAt(0);

            // nastavim false to že  máme rovnake hodnoty
            boolean lastCommandSpace = false;

         //   System.out.println(" dlzka help world " + helpword.length());

            //cyklus ktory prechadza input slovo aj vygenerovanu kombinaciu  nul a jednotiek
            for (int j = 0; j <helpword.length() ; j++) {

                // ked posledna pridana hodnota bola medzera pridam  pismenko
                // a  ukoncim cyklus aby som už nepridaval nič
                if (lastCommandSpace) {
                    resultWord = resultWord + helpword.charAt(j);
                    System.out.println(" add letter " + helpword.charAt(j));

                    lastCommandSpace = false;
                    continue;
                }

                System.out.println("znak s pola " + pole.charAt(j));


 // ak sa  cislo s pola rovna jednej tak pridam medzeru a odpocitam j pretože som nepoužil pismeno ale medzeru
                if (Integer.parseInt(String.valueOf(pole.charAt(j))) == 1) {
                    resultWord = resultWord + " ";
                    --j;
                    lastCommandSpace = true;
                } else {// ak sa nerovna jednej tak pridaj pismenko ktore je v poradi
                    resultWord = resultWord + helpword.charAt(j);
                    lastCommandSpace = false;
                }



            }
            helpResult = resultWord;
            System.out.println("======================== pokus cislo " + i );
            System.out.println("hash code what I made    " + resultWord.hashCode() );
            System.out.println("Hahshcode  original word  "+  hashCode);

            System.out.println("value   " + resultWord );
            System.out.println("========================");

            if (resultWord.hashCode() == hashCode) {
                System.out.println("MAME ZHODU");
                samenessValues = true;
                
                break;
            } 

        }

        if (samenessValues == false) {
            System.out.println("Nemame zhodu ");
            return null;

        } else {
            return helpResult;
        }
    }


    public static void main(String[] args) {
        NajdiSlovo najdiSlovo = new NajdiSlovo("vedroboloderaveleboprasklo", "vedro bolo derave lebo prasklo".hashCode());
        System.out.println(najdiSlovo.najdiRiesenie());
    }

}



