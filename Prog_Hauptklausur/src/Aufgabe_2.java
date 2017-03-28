public class Aufgabe_2 {

 // a) Formen Sie die nachfolgende for-Schleife in eine while-Schleife um.
 protected static int FortoWhile() {
   int a = 0;
   for (int i = 7; i < 12; i += 3)
    a += i * 2;
  }
  //	Wird zu While-Schleife:
 protected static int WhileSchleife() {
   int a = 0;
   int i = 7;
   while (i < 12) {
    a += i;
    i += 3;
   }
  }
  //  b) Formen Sie die nachfolgende while-Schleife in eine for-Schleife um.	
 protected static int WhiletoFor() {
   int i = 12;
   while (i > 0) {
    i--;
   }
  }
  //	Wird zur for-Schleife:
 protected static int ForSchleife() {
   for (int i = 12; i > 0; i--);
  }
  //	c) Formen Sie die nachfolgende rekursive Methode in eine iterative Methode um.

 protected static int calcrekursiv(int a) {
   if (a == 0) {
    return 42;
   } else {
    return 2 * calcrekursiv(a - 1);
   }
  }
  // Wird zur iterativen Methode:
 protected static int calciterativ(int a) {
  int tmp = 42;
  for (int i = a; i > 0; i++) {
   tmp = tmp * 2;
  }
  return tmp;
 }
}