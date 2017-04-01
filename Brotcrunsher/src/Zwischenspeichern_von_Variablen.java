
public class Zwischenspeichern_von_Variablen {
	
	public static void main(String[]args) {
		
		int x, y, z;
		x = 1;
		y = 2;
		
		
		System.out.println("X = " + x + "  Y = " + y);
		
		z = x;
		x = y;
		y = z;
		
		System.out.println("X = " + x + "  Y = " + y);		

		
	}
}