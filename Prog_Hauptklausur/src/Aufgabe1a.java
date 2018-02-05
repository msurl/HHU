/*
 * Implementieren Sie die Methode pow, die xn berechnet und zurückgibt (mit x >= 0). Die Bibliothek Math 
 * oder weitere Ihnen bekannte Bibliotheken dürfen Sie dazu nicht verwenden.
 */

public class Aufgabe1a {

 public static void main(String args[]) {

  double x = 2;
  int n = 2;
  int z = (int) pow(x, n);
  System.out.println(z);
 }
 public static double pow(double x, int n) {

  double a = 1;
  for (int i = 0; i < n; i++) {
   a *= x;


  }
  return a;
 }
}
 
