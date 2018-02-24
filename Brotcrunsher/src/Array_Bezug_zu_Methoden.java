
public class Array_Bezug_zu_Methoden {
	public static void main(String args[]){
	int[] zahlen = new int[10];
	zahlen[0]=1;
	System.out.println(zahlen[0]);
	seltsam(zahlen);
	System.out.println(zahlen[0]);
	}
	static void seltsam(int[] x){
		x[0]++; //erhöhe um 1, array ist kein primitiver datentyp, daher haben hier die beiden x-e miteinander zu tun!
	}

}
