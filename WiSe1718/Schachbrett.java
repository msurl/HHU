
/******************************************************************************
 *  Compilation:  javac Schachbrett.java
 *  Execution:    java Schachbrett n
 *  Test:         ./gradlew testen
 *
 *  Eingabe: Eine positive, ganze Zahl n.
 *  Ausgabe: Ein Schachbrett der Groesse n * n. Schwarze Felder werden durch einen
 *  Stern '*', weisse Felder durch ein Leerzeichen ' ' dargestellt. Das Brett
 *  beginnt mit einem schwarzen Feld.
 *
 * Ueberpruefen Sie, dass die Eingabe positiv ist. Wenn die Eingabe nicht positiv ist,
 * soll das Programm ERROR ausgeben. Andere Fehleingaben koennen Sie ignorieren.
 * 
 ******************************************************************************/

import java.util.Scanner;

public class Schachbrett {

	public static void main(String[] args) {

		// int n = Integer.parseInt(args[0]);

		Scanner s = new Scanner(System.in);
		System.out.println("Zahl eingeben");
		int n = s.nextInt();
		if (n < 1) {
			System.out.println("ERROR");
		return;}

		for (int i = 0; i <= n; i++) {
			if (i % 2 == 0) {
				System.out.println("*");
				if (!(i % 2 == 0));
			}
		}

	}
}
