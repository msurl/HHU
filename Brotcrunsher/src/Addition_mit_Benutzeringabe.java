import java.util.Scanner;

 
public class Addition_mit_Benutzeringabe {
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		
		int x,y,z;

		System.out.println("Nenne zwei Zahlen zum Addieren");
		x = s.nextInt();
		y = s.nextInt();
		z=x+y;
		System.out.println(x +" + "+y+" = "+ z);
	}
}
