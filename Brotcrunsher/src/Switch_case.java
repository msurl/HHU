import java.util.Scanner;

public class Switch_case {
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		int antwort;
		System.out.println("Wieviele Monde hat die Erde?");
		antwort = s.nextInt();
		switch(antwort){
		case 0:
			System.out.println("Leider zu wenig!");
			break;
		case 1:
			System.out.println("Richtig!");
			break;
		case 2:
			System.out.println("Zu viel!");
			break;
		default: 	
			System.out.println("Falsch!");
			break;
		
		}
				
	}

}
