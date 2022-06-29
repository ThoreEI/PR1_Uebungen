package Klaus_Beispielklausur_2;

public class Knoten {

    public static void main (String[] args) {
        Knoten n = new Knoten(1, new Knoten(1, null));
        Knoten n2 = new Knoten(7, null);
        Knoten n3 = new Knoten(8, null);
        n.setNaechster(n2);
        n2.setNaechster(n3);

        boolean contains = n.kommtVor(n, 7);
        System.out.println(contains);
    }

    private int wert;
    private Knoten naechster;

    public Knoten(int w, Knoten n) {
        setWert(w);
        setNaechster(n);
    }

    int getWert() {
        return wert;
    }

    void setWert(int w) {
        wert = w;
    }

    Knoten getNaechster() {
        return naechster;
    }

    void setNaechster(Knoten n) {
        naechster = n;
    }

    boolean kommtVor(Knoten a, int x) {
        while (a.getNaechster() != null) {
            if (a.getNaechster().getWert() == x)
                return true;
            a = a.getNaechster();
        }
        return false;
    }
}

