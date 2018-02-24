import java.util.Scanner;


public class Aufruf_mehrerer_Methoden {
	public static void main(String args[]){
		System.out.println("Bin in der Main");
		Irgendwas1();
		System.out.println("Bin wieder zurück in der Main");


	}

	private static void Irgendwas1(){
		System.out.println("Bin in Irgendwas 1");
		Irgendwas2();
		System.out.println("Bin das zweite Mal in Irgendwas 1");
	}
	private static void Irgendwas2(){
		System.out.println("Bin in Irgendwas 2");

	}
}
