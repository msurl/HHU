
/*
 * Aufgabe 1: Logische Ausdrücke
 *
 * a) Geben Sie für jeden der folgenden Ausdrücke einen entsprechenden (möglichst kurzen) Java-Ausdruck an, der true
liefert, wenn die Bedingung zutrifft, und ansonsten false. a, b, und c sind int-Variablen, d, e, f sind boolean-
Variablen.
 */
public class Blatt1 {
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

    protected static boolean No1B() {
        int a = 0;

        if (a <= 10 && a <=-10 && a%2 == 0) {
            return true;
        } else {
            return false;
        }
    }
    protected static boolean No1C() {
        int b = 95;

        if (b%19 == 0) {
            return true;
        } else {
            return false;
        }
    }
    
    protected static boolean No1D() {
        int c = 17;

        if (c == 17 | c == 77 | c == 91 ) {
            return true;
        } else {
            return false;
        }
    }
    
    protected static boolean No1E() {
        boolean d = true;
        boolean e = true;
        boolean f = true;

        if (d==true && e==true && f==true) {
            return true;
        } else {
            return false;
        }
    }
    
    protected static boolean No1F() {  // wie alle Fälle einschließen?
        boolean d = true;
        boolean e = false;
        boolean f = true;

        if (d==true && e==false && f==true) {
            return true;
        } else {
            return false;
        }
    }



        	
        
    }


//~ Formatted by Jindent --- http://www.jindent.com
