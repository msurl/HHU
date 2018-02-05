import java.math.*;

import java.util.Scanner;

public class Blatt2 {

    /*
     *  > Aufgabe 1: Verzweigungen und Schleifen < 
     *  a)
     *   1. if a > b c = 0; // Klammer fehlt
     *   2. if (a>b)c=0; //korrekt
     *   3.if(a=1)c=0; // "a==1" w�rde sinn machenb
     *   4. if (a>b)c=0 else b=0; //korrekt
     */

    // b) Seien i und j zwei Variablen vom Typ int. Geben Sie den Wert von j am Ende der Anweisungen an.
    protected static int Aufgabe1b() {
        int j;

        for (j = 0; j < 10; j++) {
            j += j++;    // muss so, weil j sonst nur innerhalb der for-schleife existiert
        }

        /*
         * 1.)for (i = 0, j = 0; i < 10; i++) j += i; >> j = 45
         * 2) for (i = 0, j = 1; i < 10; i++) j += j; >> j = 1024
         * 3) for (j = 0; j < 10; j++) j += j; >> j = 15
         * 4) for (i = 0, j = 0; i < 10; i++) j += j++;; >> j = 0, Startwert 0 daher keine Inkrementierung
         *
         * Ablaufbeispiel zu 1):                                                                                                                                 Vor n�chster Runde
         * 1. Init: i=0,j=0,  >> i<10 trifft zu >> i(0)+1 ab n�chsten Durchlauf >> j(0)=j(0)+i(0)   //j=0  i=1
         * 2. Init  i=1,j=0   >> i<10 trifft zu >> i(1)+1 ab n�chsten Durchlauf >> j(0)=j(0)+i(1)   //j=1  i=2
         * 3. Init  i=2,j=2   >> i<10 trifft zu >> i(2)+1 ab n�chsten Durchlauf >> j(1)=j(1)+i(2)   //j=3  i=3
         * 4. Init  i=3,j=3   >> i<10 trifft zu >> i(3)+1 ab n�chsten Durchlauf >> j(3)=j(3)+i(3)   //j=6  i=4
         * 5. Init  i=4,j=6   >> i<10 trifft zu >> i(4)+1 ab n�chsten Durchlauf >> j(6)=j(6)+i(4)   //j=10 i=5
         * 6. Init  i=5,j=10  >> i<10 trifft zu >> i(5)+1 ab n�chsten Durchlauf >> j(10)=j(10)+i(5) //j=15 i=6
         * 7. Init  i=6,j=15  >> i<10 trifft zu >> i(6)+1 ab n�chsten Durchlauf >> j(15)=j(15)+i(6) //j=21 i=7
         * 8. Init  i=7,j=21  >> i<10 trifft zu >> i(7)+1 ab n�chsten Durchlauf >> j(21)=j(21)+i(7) //j=28 i=8
         * 9. Init  i=8,j=28  >> i<10 trifft zu >> i(8)+1 ab n�chsten Durchlauf >> j(28)=j(28)+i(8) //j=36 i=9
         * 10. Init  i=9,j=36  >> i<10 trifft zu >> i(9)+1 ab n�chsten Durchlauf >> j(36)=j(36)+i(9) //j=45  i=10
         * 11. Init  i=10,j=45  >> i(10)<10 trifft nicht zu >> Beende Schleife
         */
        return (j);
    }

    // c) Welchen Wert haben m und n nach der Ausf�hrung der folgenden Anweisungen?
    protected static void Aufgabe1c() {
        int n = 123456789;
        int m = 0;

        while (n != 0) {
            m = (10 * m) + (n % 10);
            n = n / 10;
        }

        System.out.println("B2.1c:\nn = " + n + "\nm = " + m);
    }

    /*
     *  d)Formen Sie die nachfolgenden for-Schleifen jeweils in eine while-Schleife um.
     * 1.
     */
    protected static void Aufgabe1d() {
        for (int i = 20; i > 1; i--) {
            System.out.println(i);
        }
    }

    protected static void Aufgabe2() {
        double gon = 200;

        gon *= 0.9;
        System.out.println("Aufgabe 2: 200 Gon sind: " + gon + " Grad");
    }

    protected static void Aufgabe3() {
        double x         = 1;
        double v         = 2;
        double t         = 3;
        double g         = 9.81274;
        double ballistic = ((x + v) * t) - ((g * Math.pow(t, 2)) / 2);

        System.out.println("Aufgabe 3: Nach " + t + " Sekunden befindet sich der K�rper mit der Geschwindigeit " + v
                           + " und der Ausgangsposition " + x + " an der neuen Position " + ballistic);
    }

    protected static void Aufgabe4() {
        int zufallszahl;

        zufallszahl = (int) (Math.random() * 44) + 6;
        System.out.println(zufallszahl);
    }

    protected static void Aufgabe5() {
        int a = 3;
        int b = 4;
        int c = 5;

        // Median a:
        if (((c < a) && (a < b)) || ((a < b) && (c < a))) {
            System.out.printf("Das Median von %d, %d und %d ist %d.", a, b, c, a);
        }

        // Median b:
        if (((a < b) && (b < c)) || ((b < c) && (a < b))) {
            System.out.printf("Das Median von %d, %d und %d ist %d.", a, b, c, b);
        }

        // Median c:
        if (((b < c) && (c < a)) || ((c < a) && (b < c))) {
            System.out.printf("Das Median von %d, %d und %d ist %d.", a, b, c, c);
        }
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
