package SL_Hummel;

import SL_Hummel.BlackJackSpiel.BlackJackSpiel;
import SL_Hummel.domain.Karte;
import SL_Hummel.domain.Kartenstapel;

public class Main {

    public static void main (String[] args) {
  new BlackJackSpiel();
  Karte k = new Kartenstapel().getKarte();
        System.out.println(k.toString());
  System.out.println(k.getPunkte());

    }
}
