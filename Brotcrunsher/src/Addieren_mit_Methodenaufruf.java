import java.util.Scanner;

public class Addieren_mit_Methodenaufruf {
	public static void main(String args[]){
		int x;
		int y;
		x = 1;
		y = 1;
		AddiereXY(x,y);
	}	

	private static void AddiereXY(int x, int y) {
		int z;
		z = x+y;
		System.out.println(z);
		
	}

}
