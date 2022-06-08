package Hummel_Klausur;
public class Cell {
    private String formula = "";
    private String value = "";

    public String getFormula() {
        return formula;
    }

    public void setFormula(String formula) {
        // TODO: Methode so implementieren, dass alle Formeln in Großbuchstaben umgewandelt werden

        // und das Gleichheitszeichen am Anfang entfernt wird
        // Bsp.: =3+a1+5 wird zu 3+A1+5 -> 5 Punkte
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String toString() {
        return String.format("%4s", value);
    }

    public boolean isEmpty() {
        return value.isEmpty();
    }

}
