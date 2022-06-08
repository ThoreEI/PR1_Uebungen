package SL_Hummel.domain;

public class Karte {
    private final String farbe;
    private final String karte;

    public Karte(String farbe, String karte) {
        this.farbe = farbe;
        this.karte = karte;
    }

    public int getPunkte() {
        return switch (karte) {
            case "Bube", "Dame", "König" -> 10;
            case "Ass" -> 11;
            default -> Integer.parseInt(karte);
        };
    }

    @Override
    public String toString() {
        return "Karte{" + "Farbe='" + farbe + '\'' + ", Karte='" + karte + '\'' + '}';
    }
}
