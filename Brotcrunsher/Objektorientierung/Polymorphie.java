import java.util.Scanner;

public class Polymorphie {

	public static void main(String[] args) {

		Lebewesen lw = new Mensch();
		
		Lebewesen[] l = new Lebewesen[5];
		Scanner s = new Scanner(System.in);
		String eingabe = "";
		
		for(int i = 0; i<l.length; i++){
			System.out.println("Welches Lebewesen soll erschaffen werden? mensch/hund");
			eingabe = s.next();
			if(eingabe.equals("hund")){
				l[i] = new Hund();
			}else if(eingabe.equals("mensch")){
				l[i] = new Mensch();
			}
		}

	}

}