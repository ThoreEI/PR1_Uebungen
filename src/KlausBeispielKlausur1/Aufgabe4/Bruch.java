package KlausBeispielKlausur1.Aufgabe4;

public class Bruch {

    private long zaehler;
    private long nenner;

    public Bruch(long zaehler, long nenner) {
        this.zaehler = zaehler;
        this.nenner = nenner;
    }

    public Bruch(long zaehler) {
        this.zaehler = zaehler;
    }

    public  Bruch add(long zaehler, long nenner) {
        long ggT = ggt(zaehler, nenner);
        zaehler /= ggT;
        nenner /= ggT;
        if (nenner == 1)
            return new Bruch(zaehler);

        return new Bruch(zaehler, nenner);
    }


    private long ggt(long zaehler, long nenner) {
        if (nenner == 0)
            return zaehler; // ggT
        return ggt(nenner, zaehler % nenner);
    }

    public String toString() {
        if (Math.abs(this.nenner) > 1)
            return this.zaehler + "/" + this.nenner;
        return this.zaehler + "";
    }
}
