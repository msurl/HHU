import java.util.Scanner;

public class Try_and_catch {

	public static void main(String[] args) {

		int zahl1, zahl2, zahl3;
		Scanner s = new Scanner(System.in);
		zahl1 = s.nextInt();
		zahl2 = s.nextInt();

		try {
			zahl3 = zahl1 / zahl2;
		} catch (Exception e) {
			System.out.println("Oh nein! Es ist ein Fehler aufgetreten"
					+ e.toString());
			zahl3 = 0;
		}

		System.out.println(zahl3);

	}

}

// Versuche etwas, wenn es nicht klappt führe den Block von catch aus mit der Aussnahme, dass..

