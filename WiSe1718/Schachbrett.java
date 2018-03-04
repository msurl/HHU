import java.util.Scanner;

public class Schachbrett {

	public static void main(String[] args) {
		/*
		 * int n = Integer.parseInt(args[0]); Scanner s = new Scanner(System.in);
		 * System.out.println("Zahl eingeben"); int n = s.nextInt(); if (n < 1) {
		 * System.out.println("ERROR"); } else { int tmp = n; for (int i = 0; i <= tmp;
		 * i++) { if(i%2==0) { System.out.println("*");} else if (!(i%2==0));{
		 * System.out.print(" ");} }
		 * 
		 * }
		 */
		//int n = Integer.parseInt(args[0]);
		Scanner s = new Scanner(System.in);
		System.out.println("Zahl eingeben");
		int n = s.nextInt();
		

		for (int i = 1; i <= n; i++) {
			for (int j = i; j <= n + i - 1; j++)
				if (j < 10 && j != i)
					System.out.print(" " + "*" + " ");
				else
					System.out.print("*" + " ");
			System.out.println();
		}
	}

}