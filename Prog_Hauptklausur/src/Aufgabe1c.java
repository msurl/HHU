/* Aufgabenstellung: 
Schreiben Sie eine Methode boolean canBalance(int[] array), die ein nicht-leeres Integer-Array
übergeben bekommt und zurückgibt, ob es eine Position gibt, an der das Array in zwei Arrays mit der gleichen
Summe ihrer Elemente aufgeteilt werden kann. (7 Punkte)
*/


public class Aufgabe1c {

 public static void main(String args[]) {


  int array[] = {1,2,3,1,0,2,3};
  boolean z = canBalance(array);
  System.out.println(z);
 }
 public static boolean canBalance(int[] array) {
   int j = array.length - 1; //anzahl elemente im array, also index 0-4, aber j=5 elemente
   int i = 0;
   int summe1 = 0;
   int summe2 = 0;

   while (i!= j + 1) { //bis die werte nebeneinander stehen dann abbruch
    if (summe1 >= summe2) {
     summe2 += array[j]; //0+inhalt des index 4 des arrays, also 1
     j--;
    }
     else {
      summe1 += array[i];
      i++;
     }
    }
    if (summe1 == summe2) {
    return true;
    }
    return false;
   }
}

// >> gibt immer false aus?