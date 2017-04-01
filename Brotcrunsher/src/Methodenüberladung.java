
public class Methodenüberladung {
	public static void main(String args[]){
		int x, y, z, z1;
		x = 3;
		y = 5;
		z = rechnen (x, y);
		System.out.println(z);
	}
	
	public static int rechnen(int x, int y){  //Die Methode rechnen ist überladen
		int z;
		z = x+y;
		return z;
	}
	public static int rechnen(int x, int y, boolean plus){
		int z;
		if(plus){
			z = x + y;
			return z;
		}else{
			z = x - y;
			return z;
		}
	}

}
