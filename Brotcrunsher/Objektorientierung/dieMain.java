public class dieMain { // zu Objektorientierung
 public static void main(String args[]) {
  //Mensch karl = new Mensch(70, 80, "Karl", "Schwarz");
  //System.out.println(karl.alter);
  //System.out.println(karl.iq);
  //System.out.println(karl.name);
  //System.out.println(karl.toString());

			for (int i = 0; i < 4; i++) {
				Threads t = new Threads();

				Thread x = new Thread(t);

				x.start();
			}
		}	
 }

