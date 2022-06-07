public class Bruch {
    private long zaehler;
    private long nenner;

    public Bruch(long zaehler, long nenner) {
        int ggt = ggt(zaehler, nenner);
        this.zaehler = zaehler / ggt;
        this.nenner = nenner/ ggt;
    }

    public Bruch(long value) {
        this.zaehler = value;
        this.nenner = 1;
    }

    private int ggt(long zaehler, long nenner) {
        if (nenner == 0)
            return (int) zaehler;
        return ggt(nenner, zaehler % nenner);
    }

    private String toString (long zaehler, long nenner) {
        if (zaehler % nenner == 0)
            return "Bruch " + zaehler / nenner;
        return " Zaehler " + zaehler +  "\n Nenner " +   nenner + " ";
    }

    public static void main (String[] args) {
        Bruch bruch1 = new Bruch(6, 8);
        System.out.println(bruch1.toString(bruch1.zaehler, bruch1.nenner));
    }
}

