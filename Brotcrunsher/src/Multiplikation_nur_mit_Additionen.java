import java.util.Scanner;

public class Multiplikation_nur_mit_Additionen {
	public static void main(String[] args) {
		int x = 8;
		int y = 8;
		int z = multi(x,y);
		System.out.println(z);
	}
	static int multi(int x, int y){
		int loesung = 0;
		for(int i=0; i < y; i++)  //mathematisch passiert was??!  
			loesung +=x;
		return loesung;
		
	}

}
