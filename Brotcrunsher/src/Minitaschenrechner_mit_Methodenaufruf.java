import java.util.Scanner;

public class Minitaschenrechner_mit_Methodenaufruf {
	public static void main(String args[]){
		
		double x,y,z;
		String s;
		Scanner scan = new Scanner(System.in);
		x = scan.nextInt();
		y = scan.nextInt();
		s = scan.next();
		z = rechnen(x,y,s);
		System.out.println(z);
	

	
}

	private static double rechnen(double x, double y, String s){
		double z;
		if(s.equals("+"))
		z=x+y;
		else if(s.equals("-"))
		z=x-y;
		else if(s.equals("*"))
		z=x*y;
		else if(s.equals("/"))
		z=x/y;
		else{
			System.out.println("Nur + - * /");
			return -1;
		}
		
		return z;
		 
	}
		
}