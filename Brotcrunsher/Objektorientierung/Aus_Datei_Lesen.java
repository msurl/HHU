import java.util.*;
import java.io.*;

public class Aus_Datei_Lesen{

	Scanner s;

	DateiHandler(File f){


		try{
			s = new Scanner(f);
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}
	}


	public Mensch lesen(){
	
	if(s.hasNext()){
	
	int alter = s.nextInt();
	int iq = s.nextInt();
	String name = s.next();
	String haarfarbe = s.next();

	return new Mensch(alter, iq, name, haarfarbe);

	}
	

	return null;
	}

	public void schliesen(){
	s.close();
	}

}


