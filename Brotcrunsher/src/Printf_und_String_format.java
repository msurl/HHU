
public class Printf_und_String_format {
	public static void main(String args[]){
		//Scanner s = new Scanner(System.in);
		int x = 10;
		int y = 6;
		int z = 30;
		String s = Uhrzeit(x, y, z); //String s ruft direkt die drei Werte der private Methode auf
		System.out.printf("hallo! %d fah %d df", x,  y); 
		System.out.println(s);
		
		
		/*wenn ich zum schluss noch variablen anzeigen möchte setze %d platzhalter.
		 * er setzt die variablen links beginnend chronologisch nach gesetzten %d.
		 * Alternativ kann man die ausgabe auch in einen String schreiben und diesen mit println ausgeben; selbe syntax.
		 */
	}
	private static String Uhrzeit(int x, int y, int z) {
		return String.format("[%d:%d:%d]", x,  y, z); // Methode returned direkt den String
	}
	
}


