import java.util.Scanner;

public class Arrayinhalt_und_gr��e_per_Benutzereingabe {
	public static void main(String args[]){
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Wieviele Zahlen m�chtest Du eingeben?");
		
		int anzahl = s.nextInt();
		int[] zahlen = new int[anzahl];
		for (int i=0; i<zahlen.length; i++) {
			zahlen[i] = s.nextInt();
		}
		System.out.print("[");
		for(int i = 0; i<zahlen.length; i++){
			System.out.print(zahlen[i]);
			if(i<zahlen.length-1){ //es gibt immernoch ein n�chstes indize des arrays!
				System.out.print(",");
			}
		}
		
		System.out.println("]");
		
		
	}
}
