
public class Uebergeben_beliebig_vieler_int_Werte_an_Methode {
	public static void main(String args[]){
		int x, y, z, z1;
		x = 3;
		y = 5;
		z = 9;
		z1 = rechnen(x, y, z);  //Übergabe von Werten an die Methode rechnen
		System.out.println(z1);
	}
	
	public static int rechnen(int... x){
		int z = 0;
		for(int i = 0; i<x.length; i++){
			z+=x[i];
		}
		return z;
	}

}
