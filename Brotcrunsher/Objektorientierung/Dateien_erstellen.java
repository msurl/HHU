import java.io.File;
import java.util.Formatter;
import java.io.FileNotFoundException;

public class Dateien_erstellen {
 public static void main(String[] args) {

  File f = new File("C://test//apfel.txt");

  if (!f.exists()) {
   try {
    Formatter format = new Formatter("C://test//apfel.txt");
   } catch (FileNotFoundException e) {
    e.printStackTrace();
   }
  }

 }


}