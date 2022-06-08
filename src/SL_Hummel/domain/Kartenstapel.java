package SL_Hummel.domain;

import java.util.ArrayList;

public class Kartenstapel {
    private final ArrayList<Karte> kartenStapel = new ArrayList<>();

    public Kartenstapel() {
        String[] farben = {"Kreuz", "Pik", "Herz", "Karo"};
        for (int i = 2; i <= 10; i++)
            for (String farbe : farben)
                kartenStapel.add(new Karte(farbe, i + "" ));
        for (String farbe : farben) {
            kartenStapel.add(new Karte(farbe, "Bube"));
            kartenStapel.add(new Karte(farbe, "Dame"));
            kartenStapel.add(new Karte(farbe, "König"));
            kartenStapel.add(new Karte(farbe, "Ass"));
        }

        java.util.Collections.shuffle(kartenStapel);

    }

    public Karte getKarte() throws RuntimeException {
        try {
                return this.kartenStapel.remove(0);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public ArrayList <Karte> getKartenStapel() {
        return kartenStapel;
    }

    public int getZahlÜbrigerKarten() {
        return kartenStapel.size();
    }
}
