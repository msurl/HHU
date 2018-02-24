import java.util.Scanner;

public class Quersumme {
	public static void main(String[] args){
		int zahl;
		int z = 0;
		
		Scanner s = new Scanner(System.in);
		System.out.println("Zahl eingeben");

		zahl = s.nextInt();
		
		
			while(true){
				if(zahl<=0){
					break;
				}	
				z += zahl%10;  //hier wird zahl plus das ergebnis aus zahl%10 gerechnet
				zahl = zahl/10;
					
			
			}
			System.out.println(z);
		
		}
}