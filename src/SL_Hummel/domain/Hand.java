package SL_Hummel.domain;


public class Hand {
    private Kartenstapel ks;

    public Hand(Karte karte1, Karte karte2) {
        ks = new Kartenstapel();
        ks.getKartenStapel().add(karte1);
        ks.getKartenStapel().add(karte2);
    }

    @Override
    public String toString() {
        StringBuilder hand = new StringBuilder();
        for (Karte k : ks.getKartenStapel())
            hand.append(k.toString());
        return hand.toString();
    }

    public int getPunkte ()  {
        int punkte = 0;
        for (Karte k : ks.getKartenStapel())
            punkte += k.getPunkte();
        return punkte;
    }

    public boolean isBlackJack () {
        return getPunkte() == 21;
    }

}
