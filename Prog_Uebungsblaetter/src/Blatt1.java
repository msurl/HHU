public class Blatt1 {

    /*
     *  > Aufgabe 2: Die Winkelma�einheit Gon <
     * Das Gon ist eine Hilfsma�einheit zur Angabe derWinkelweite ebenerWinkel, die sich letztendlich nur im Vermessungswesen-
     * wesen etablieren kontte. Als Einheitszeichen wird "gon" verwendet. Ein Gon ist definiert als der vierhundertste Teil
     * des Vollwinkels, dh.h, 1 Vollwinkel = 400g = 360�.
     *
     * Schreiben Sie ein Java-Programm, dass eine beliebige ganze Zahl in der EInheit Gon korrekt in das Gradma� �berf�hrt
     * und ausgibt. Beachten Sie, dass das Ergebnis eine Gleitkommazahl sein kann.
     */
    protected static String Aufgabe2() {
        double i = 5.0;
        double ergebnis;
        double faktor;

        faktor   = 360.0 / 400.0;
        ergebnis = i * faktor;

        String f = (i + " " + "Gon sind umgerechnet " + ergebnis + "�");

        return f;
    }

    /*
     *  > Aufgabe 3: Ballistische Kurve <
     * Schreiben Sie ein Programm Balistic, das mithilfe der Formel x0+v0*t-(g*t^2)/2 das Ergebnis f�r drei beliebigen
     * positiven Flie�kommazahlen x0, v0 und t berechnet. Die Formel berechnet die Position eines K�rpers nach der Zeit t,
     * der von Position x0 aus mit einer Geschwindigkeit v0 nach oben geworfen wird. Die Konstante g = 9; 81274 m/s^2 ist
     * die Erdbeschleunigung.
     */
    protected static String Aufgabe3() {
        double anfangsposition   = 5.0;        // x
        double geschwindigkeit   = 5.0;        // v
        double zeit              = 6.0;
        double erdbeschleunigung = 9.81274;    // g
        double endposition;                    // formel inkludiert

        endposition = ((anfangsposition + geschwindigkeit) * zeit) - (erdbeschleunigung * (Math.pow(zeit, 2))) / 2;

        String f = ("Der K�rper auf Position " + anfangsposition + " befindet sich nach " + zeit + " Sekunden"
                    + "an der Endposition " + endposition);

        return f;    // Ausgabe ist -116.62932, korrekt w�re -146.62932
    }

    /*
     *  > Aufgabe 4: Zufallszahlen <
     * Schreiben Sie ein Java-Programm, welches eine Zufallszahl zwischen denWerten der beiden Variablen n und m erzeugt.
     * Die Zufallszahl soll dabei auch die Werte von n und m annehmen k�nnen. Die Erzeugung von Zufallszahlen zwischen n
     * und m kann beispielsweise zur Simulation von Gl�cksspielen (Lotto 6 aus 49, etc.) verwendet werden.
     */
    protected static int Aufgabe4() {
        int m           = 6;
        int n           = 49;
        int zufallszahl = (int) (Math.random() * 44) + 6;

        return zufallszahl;
    }

    /*
     *  > Aufgabe 5: Medianbestimmung <
     * Schreiben Sie ein Programm, das den Median von drei beliebigen ganzen Zahlen a, b und c bestimmt. Der ermittelte
     * Median soll am Ende ausgegeben werden.
     * Hinweis: Der Median einer Zahlenfolge ist das mittlere Element der sortierten Zahlenfolge. Sie sollen aber keinen
     * Sortieralgorithmus implementieren.
     */
    protected static int Aufgabe5() {
        int[]  zahlen = new int[3];
        double median;

        zahlen[0] = 1;
        zahlen[1] = 15;
        zahlen[2] = 3;

        // for (int i=0; i<zahlen.length; i++) {
        // zahlen[i] =(int) (Math.random()+2);
        // System.out.println(zahlen[i]);
        // }
        // int mittelwert = (zahlen[0]+zahlen[1]+zahlen[2])/3;
        // System.out.println(mittelwert);
        if (zahlen.length % 2 == 0) {
            median = ((double) zahlen[zahlen.length / 2] + (double) zahlen[zahlen.length / 2 - 1]) / 2;
        } else {
            median = (double) zahlen[zahlen.length / 2];
        }

        return (int) median;
    }

    /*
     *  > Aufgabe 1: Logische Ausdr�cke <
     * a) Geben Sie f�r jeden der folgenden Ausdr�cke einen entsprechenden (m�glichst kurzen) Java-Ausdruck an, der true
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
}


//~ Formatted by Jindent --- http://www.jindent.com
