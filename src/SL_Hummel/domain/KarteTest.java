package SL_Hummel.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class KarteTest {

    Karte k = new Karte("Pik","2" );
    Karte k1 = new Karte("Karo","7" );
    Karte k2 = new Karte("Herz","Ass" );
    Karte k3 = new Karte("Pik","11" );
    Karte k4 = new Karte("König","22" );

    @Test
    void getKarteTest() {
        assertEquals(2, k.getPunkte());
        assertEquals(7, k1.getPunkte());
        assertEquals(11, k2.getPunkte());
        assertEquals(11, k3.getPunkte()); // falsch
        assertEquals(22, k4.getPunkte()); // falsch


    }

}