package SL_Hummel;

import SL_Hummel.BlackJackSpiel.BlackJackSpiel;
import SL_Hummel.domain.Karte;
import SL_Hummel.domain.Kartenstapel;

public class Main {

    public static void main (String[] args) {

        String t = "Halo";
        Object o = t.charAt(0)-1;
        System.out.println(Character.getNumericValue('o'));
        System.out.println(Character.getNumericValue(t.charAt(0)-1));

        /*
        new BlackJackSpiel();
  Karte k = new Kartenstapel().getKarte();
        System.out.println(k.toString());
  System.out.println(k.getPunkte());


         */
    }
}
