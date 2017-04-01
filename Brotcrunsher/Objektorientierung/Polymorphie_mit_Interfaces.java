import java.util.Scanner;
public class Polymorphie_mit_Interfaces {
		public static void main(String[] args) {

			Interfaces[] l = new Interfaces[5];

			Scanner s = new Scanner(System.in);
			String eingabe = "";

			for (int i = 0; i < l.length; i++) {
				System.out
						.println("Welches Lebewesen soll erschaffen werden? mensch/hund");
				eingabe = s.next();
				if (eingabe.equals("hund")) {
					l[i] = new Hund();
				} else if (eingabe.equals("mensch")) {
					l[i] = new Mensch();
				}
			}

			for (int i = 0; i < l.length; i++) {

				if (l[i] instanceof Hund) {
					System.out.println("Wauwau");
				} else if (l[i] instanceof Mensch) {
					System.out.println("Blabla");
				}
			}

		}

}
