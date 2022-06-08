package SL_Hummel.BlackJackSpiel;

import SL_Hummel.domain.Hand;
import SL_Hummel.domain.Kartenstapel;


public class BlackJackSpiel {
    private Kartenstapel kartenstapel;

    public BlackJackSpiel() {
        kartenstapel = new Kartenstapel();
        getNeueHand();
    }

    public Hand getNeueHand() {
        return new Hand(kartenstapel.getKarte(), kartenstapel.getKarte());
    }
}
