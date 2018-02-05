 
public class Aufgabe5_main {
		public static void main(String[] args){
		Aufgabe5_Human z = new Aufgabe5_SuperVillain();
		System.out.println(z.specialPower());
		
		Aufgabe5_SuperHero z1 = new Aufgabe5_SuperHero();
		System.out.println(z1.specialPower());
		
		Aufgabe5_Human z2 = new Aufgabe5_SuperHero();
		System.out.println(z2.category());
		
		Aufgabe5_SuperVillain z3 = new Aufgabe5_SuperVillain();
		System.out.println(z3.category());
		
		Aufgabe5_Human z4 = new Aufgabe5_SuperHero();
		System.out.println(z4.typeCode);
		
		Aufgabe5_Human z5 = new Aufgabe5_SuperVillain();
		System.out.println(z5.getTypeCode());
		
		Aufgabe5_Human z6 = new Aufgabe5_SuperHero();
		System.out.println(z6.getTypeCode());
		
		Aufgabe5_SuperVillain z7 = new Aufgabe5_SuperVillain();
		System.out.println(z7.getTypeCode());
		
		}
	}

/*
 * //Aufgabe 5
a) Keine  >> Da z vom typ Mensch ist und SpecialPower eine dem Mensch inhärente  statische Methode ist wird "keine"
zurückgegeben. Bei category käme "Böseweicht", denn category ist statisch
z ist eine Instanz von SuperVillian, aber in einen Human geschrieben, aufgrund von Vererbungsbeziehung (extends) zwischen
Mensch und SuperVillian. Nicht jeder Mensch ist ein SuperVillian, aber jeder SuperVillian ist ein Mensch
b) Hammer >> Zuerst erbt SuperHero von Human die SpecialPower, da SpecialPower aber bei SuperHero vorhanden wird überschrieben.
c) Held   >> Human ist Oberklasse bei static - static hat Human vorrang (extends) > hier hat SuperHero vorrang
d) Boesewicht >> Zuerst erbt initial SuperVillioan von Human die category, da category aber bei SuperVillian vorhanden wird überschrieben.
e) 0 >> Durch Vererbung hat Mensch vorrang (static)
f) 0 >> innerhalb der Humanklasse ist typecode 0
g) 1 >> superhero hat vorrang, da beide nicht static
h) 0 >> erbt methode von Human
Bemerkung: evtl ist überall z.getTypeCode ohne Veränderung ein Fehler (siehe Klausur)
 */

