public class Blatt1 {

    /*
     *  > Aufgabe 1: Logische Ausdrücke <
     * a) Geben Sie für jeden der folgenden Ausdrücke einen entsprechenden (möglichst kurzen) Java-Ausdruck an, der true
     * liefert, wenn die Bedingung zutrifft, und ansonsten false. a, b, und c sind int-Variablen, d, e, f sind boolean-
     * Variablen.
     */
    protected static boolean No1A() {
        int a = 0;
        int b = 0;
        int c = 0;

        if ((a == 0) && (b == 0) && (c == 0)) {
            return true;
        } else {
            return false;
        }
    }

//  a) a, b und c sind alle null
    protected static boolean No1B() {
        int a = 0;

        if ((a <= 10) && (a <= -10) && (a % 2 == 0)) {
            return true;
        } else {
            return false;
        }
    }

//  b) a ist gerade und liegt zwischen -10 und 10.
    protected static boolean No1C() {
        int b = 95;

        if (b % 19 == 0) {
            return true;
        } else {
            return false;
        }
    }

//  d) c ist entweder ein Vielfaches von 2 und 7 oder ein Vielfaches von 7 und 11 oder ein Vielfaches von 7 und 13.
    protected static boolean No1D() {
        int c = 17;

        if ((c == 17) || (c == 77) || (c == 91)) {
            return true;
        } else {
            return false;
        }
    }

//  e) d, e und f sind alle drei true oder alle drei false.
    protected static boolean No1E() {
        boolean d = true;
        boolean e = true;
        boolean f = true;

        if ((d == true) && (e == true) && (f == true)) {
            return true;
        } else {
            return false;
        }
    }

//  f) Genau eines von d, e und f ist false.
    protected static boolean No1F() {
        boolean d = true;
        boolean e = false;
        boolean f = true;

        if (((d == true) && (e == false) && (f == true))
                || ((d == true) && (e == true) && (f == false))
                || ((d == false) && (e == true) && (f == true))) {
            return true;
        } else {
            return false;
        }
    }
    
        /*
         *  > Aufgabe 1: Logische Ausdrücke <
         * Das Gon ist eine Hilfsmaßeinheit zur Angabe derWinkelweite ebenerWinkel, die sich letztendlich nur im Vermessungswesen-
         * wesen etablieren kontte. Als Einheitszeichen wird "gon" verwendet. Ein Gon ist definiert als der vierhundertste Teil
         * des Vollwinkels, dh.h, 1 Vollwinkel = 400g = 360°.
         * 
         * Schreiben Sie ein Java-Programm, dass eine beliebige ganze Zahl in der EInheit Gon korrekt in das Gradmaß überführt
         * und ausgibt. Beachten Sie, dass das Ergebnis eine Gleitkommazahl sein kann.
         */
        protected static String Aufgabe2() {
            double i = 5.0;
            double ergebnis;
            double faktor;
            faktor = 360/400;
            ergebnis = i * faktor;
            return String f =("i"+" "+"Gon sind umgerechnet"+ergebnis+" "+"°");      
        }
        
        
}


//~ Formatted by Jindent --- http://www.jindent.com
