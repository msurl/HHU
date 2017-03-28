
public class Blatt2 {
    /*
     *  > Aufgabe 2: Die Winkelmaßeinheit Gon <
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

        faktor   = 360.0 / 400.0;
        ergebnis = i * faktor;

        String f = (i + " " + "Gon sind umgerechnet " + ergebnis + "°");

        return f;
    }

}
