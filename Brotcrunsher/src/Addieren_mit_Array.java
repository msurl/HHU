import java.util.Scanner;


public class Addieren_mit_Array {
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		

		int[] i = new int[3];
		System.out.println("Nenne zwei Zahlen zum Addieren");
		i[0]=s.nextInt();
		i[1]=s.nextInt();

		i[2]=i[0]+i[1];
		
		
		System.out.println(i[0] +" + "+i[1]+" = "+ i[2]);
		

		
		
	}
}
