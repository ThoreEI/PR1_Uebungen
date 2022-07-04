package klaus_gdi2009;

public class Aufgabe5 {
    public static void main(String[] args) {
        // a)
         { int x, i;
            String a, b;
            { int y = 1; }
            { String  x1 /*x*/ = "y"; } // x used previous
        }
        // b)
        { int x, i;
            { String a, b; }
            { int y = 1;
                { int b = y + 1; }
            }
        }
        // c)
         { int x, i;
            String a, b;
            { int y;
                { String z = "x"; }
            }
        }
        // d)
        { int x, i;
            String a, b;
            { int y = 1; }
            { int z = 1/*y*/; } //  y not visible
        }
    }
}
