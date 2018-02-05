/* Aufgabenstellung: 
 * Implementieren Sie die Methode summe, die
 * alle Elemente in array aufsummiert und die Gesamtsumme zurückgibt.
*/ 


public class Aufgabe1b {

 public static void main(String args[]) {


  int n[] = {1,2,3,4};
  int z = summe(n);
  System.out.println(z);
 }
 public static int summe(int array[]) {
  int z = 0;
  for (int i = 0; i < array.length; i++) {
   z += array[i];
   
   
  }
return z; //warum nochmal außerhalb der Methode?
  
 }
}
    