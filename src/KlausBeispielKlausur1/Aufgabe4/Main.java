package KlausBeispielKlausur1.Aufgabe4;

public class Main {

    public static void main (String[] args) {
        Bruch bruch = new Bruch(25, 5);
        Bruch bruch2 =  bruch.add(10, 8);
        Bruch bruch3 =  bruch.add(10, 1);

        System.out.println(bruch.toString());
        System.out.println(bruch2.toString());
        System.out.println(bruch3.toString());

    }
}
