import java.util.Scanner;

public class Array_manuell_mit_Benutzereingabe {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int[] i = new int[5];
		System.out.println("Nenne 5 Zahlen");
		i[0]=s.nextInt();  
		
		/* geht auch mit for-schleife (for int i=0; i<x.length; i++)
		 * x[i] = s.nextInt();
		 * Vorteil: Keine Magicnumbers, Lesbarkeit verbessert
		 *  
		 * */
		
		i[1]=s.nextInt();
		i[2]=s.nextInt();
		i[3]=s.nextInt();
		i[4]=s.nextInt();
		
		double durchschnitt = (i[0]+i[1]+i[2]+i[3]+i[4])/5;

		
		System.out.println(durchschnitt);
		

	}

}
