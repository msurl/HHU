	import java.io.*;
	import java.util.*;

	public class In_Datei_Schreiben {


	 public static void main(String[] args) {

	  String dateiname;
	  Scanner s = new Scanner(System.in);

	  System.out.println("Welche Datei soll gelesen werden?");

	  dateiname = s.next();

	  String DateiInhalt = "";

	  File f = new File("C://test//" + dateiname + ".txt");

	  Formatter hugo = null;

	  if (f.exists()) {
	   try {

	    Scanner leser = new Scanner(f);

	    while (leser.hasNext()) {

	     DateiInhalt += leser.next();

	    }

	    hugo = new Formatter(f);

	    hugo.format("%s", DateiInhalt);

	   } catch (FileNotFoundException e) {

	    e.printStackTrace();

	   }
	  } else {

	   try {
	    hugo = new Formatter(f);
	   } catch (FileNotFoundException e) {
	    e.printStackTrace();
	   }

	  }

	  System.out.println("Was soll neu reingeschrieben werden?");

	  String neueEingabe = s.next();

	  hugo.format(" %s", neueEingabe);

	  hugo.close();

	 }

	}