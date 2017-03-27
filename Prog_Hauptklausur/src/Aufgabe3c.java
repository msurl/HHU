/*
 * Ausgaben und Exceptions
 * Aufgabenstellung zu 3c:
 * Geben Sie an, ob die mit Anweisung gekennzeichneten Stellen (Anweisung (1) bis Anweisung (6)) im
nachfolgenden Code fehlerfrei ausführbar sind oder, falls es an dieser Stelle zu einer Exception kommt, welche
dort auftritt. Geben Sie weiterhin die Ausgaben auf dem Terminal für die mit Ausgabe (Ausgabe (1) bis
Ausgabe (3)) gekennzeichneten Stellen an, wenn die nicht ausführbaren Anweisungen auskommentiert sind.
 */

import java.util.Arrays;

public class Aufgabe3c {

 public static void main(String args[]) {

  int[] a = new int[5];
  int[] b = new int[10];
  int[] c = null;
  fill(a, 2); // rufe a auf und a=2 null,3,4,5,6
  fill(b, -2); // rufe b auf und b=-2 null,-1,0,1,2 (erster aufruf -2 auf index 1, zweiter index 2-2, bis index 10)
  int[] tmp = a;
  tmp = b;
  c = a;
  b = a;
  a = tmp;
  a[5] = 5; // Anweisung ( 1 ) // +
  //b[5] = 3; // Anweisung ( 2 )  // out of bound
  c[0] = -1; // Anweisung ( 3 ) //+
  //a[10] = 0; // Anweisung ( 4 )  // out of bound
  b[3] = 6; // Anweisung ( 5 )  // +
 // c[10] = 1; // Anweisung ( 6 ) // out of bound
  System.out.println(Arrays.toString(a)); // Ausgabe ( 1 ) print(a);
  System.out.println(Arrays.toString(b)); // Ausgabe ( 2 ) print(b);
  System.out.println(Arrays.toString(c)); // Ausgabe ( 3 ) print(c);
 }
 public static void print(int[] arr) {
  if (arr != null) {
   for (int i = 0; i < arr.length; i++) {
    System.out.print(arr[i] + " ");
   }
   System.out.println();
  } else {
   System.out.println("array null");
  }
 }


 public static void fill(int[] arr, int a) { //jeder arraywert ab1: 1+a / 2+a / 3+a / 4+a  
  for (int i = 1; i < arr.length; i++) {
   arr[i] = i + a;
  }
 }
}