package Hummel_Klausur;
import static org.junit.jupiter.api.Assertions.*;

import java.io.FileNotFoundException;

import org.junit.jupiter.api.Test;

class SpreadSheetTest {

    @Test
    void testBasics() {
        Spreadsheet s = new Spreadsheet(8,8);

        s.put("a1", "x");
        assertEquals("x", s.get("A1"));

        s.put("B5", "1");
        assertEquals("1", s.get("b5"));

        s.put("H8", "-");
        assertEquals("-", s.get("H8"));
    }

    @Test
    void testImport() throws FileNotFoundException {
        Spreadsheet s = new Spreadsheet(8,8);
        s.readCsv("zahlen.csv", ',', "C2");

        assertEquals("1", s.get("C2"));
        assertEquals("6", s.get("D4"));
        assertEquals("7", s.get("C5"));
        assertEquals("8", s.get("D5"));
    }

    @Test
    void testSum() {
        Spreadsheet s = new Spreadsheet(8,8);

        s.put("C2", "2");
        s.put("D2", "1");
        s.put("C3", "3");
        s.put("D3", "4");

        s.put("D7", "=summe(c2:d3)");

        assertEquals("10", s.get("D7"));
    }

    @Test
    void testSimpleCalculation() {
        Spreadsheet s = new Spreadsheet(8,8);

        s.put("C2", "2");
        s.put("D2", "1");
        s.put("A5", "=3+C2-D2");
        assertEquals("2", s.get("A5"));

        // TODO: ergänzen Sie mindestens 3 weitere Testfälle (aus verschiedenen Äquivalenzklassen) -> 9 Punkte
    }

}
