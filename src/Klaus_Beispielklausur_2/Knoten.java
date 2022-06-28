package Klaus_Beispielklausur_2;

public class Knoten {

    public static void main (String[] args) {
        Knoten c = new Knoten(3, null);
        Knoten n = new Knoten(3,null);
        c.setNaechster(n);
        Knoten d = new Knoten(1321, new Knoten(1, n));
        n.setNaechster(d);
        d.setNaechster(n);
        boolean b =  n.kommtVor(c, 1321);
        System.out.println(b);
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

    boolean kommtVor(Knoten n, int x) {
       while (n != null) {
           if (n.getWert() == x)
               return true;
           n = n.getNaechster();
       }
        return false;
    }
}

