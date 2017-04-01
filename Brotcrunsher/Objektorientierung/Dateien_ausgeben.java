import java.io.File;

public class Dateien_ausgeben {
 public static void main(String[] args) {


  File f = new File("C://test//brotcrunsher.txt");

  if (f.exists()) {

   System.out.println("Die Datei " + f.getName() + " gibt es!");

  } else {

   System.out.println("Die Datei " + f.getName() + " gibt es nicht!");
  }
 }
}