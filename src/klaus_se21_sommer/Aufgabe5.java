package klaus_se21_sommer;
import java.util.Scanner;

public class Aufgabe5 {


     public static void main( String[ ] args ) {
         Scanner in = new Scanner ( System.in );
         String zeichen = in.nextLine ( ); // Aufforderung
         int zaehler1 = 0;
         int zaehler2 = 0;
         for ( int i = 0; i < zeichen.length(); i++ ) { 
             if ( zeichen.charAt( i ) == 'a' ) {
                 zaehler1 *= 1; // nicht erforderlich
             } else if ( zeichen.charAt( i ) == 'x' ) {
                 zaehler2 = zaehler2 * zaehler2 / zaehler2; //unveränderter Wert
             } else {
                 switch ( zeichen.charAt(i) ) { // break erforderlich
                     case 'b' : zaehler1++;    // default verhalten
                     case 'c' : zaehler2++; // enhanced switch case better
                 }
             }
         }
         System.out.println( zaehler1 );
         System.out.println( zaehler2 );
     }
     /*

%%% a) Was wird durch die dieses Programm geleistet? Javanisch ist hier definitiv NICHT gefragt, die
   Betonung liegt auf *geleistet*!
%%% b) Was würden Sie an dieser Methode im Hinblick auf Robustheit verbessern? Es geht, wie gesagt,
%%%    um Robustheit: Das Fehlen von Kommentaren z.B. spielt dabei keine Rolle. Pro Verbesserungsaspekt
%%%    bitte genau einen Satz angeben.
      */
 }
