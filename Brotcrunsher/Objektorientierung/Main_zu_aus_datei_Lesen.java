import java.io.File;
import java.util.Formatter;
import java.io.FileNotFoundException;

public class Main_zu_aus_datei_Lesen{

	public static void main(String[] args){

		File f = new File("C://test//apfel.txt");

		DateiHandler dh = new DateiHandler(f);

		Mensch m = dh.lesen();
		Mensch u = dh.lesen();
		
		System.out.println(m.toString());
		System.out.println();
		System.out.println(u.toString());		

		dh.schliesen();

	}


}