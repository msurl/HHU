
public class Rekursion {
	public static void main(String args[]){
		int y = 5;
		int z = fakultaet(y); /*übergibt y, dass in z gesaved ist,
								in z wird erst gespeichert, wenn
								Rekursion vollständig abgeschlossen,
								sprich 
							  */	
		System.out.println(z);
		
	}
	public static int fakultaet(int x){
		//System.out.println(x);
		if(x == 1){
			return 1;
			
			
		}else{
			return fakultaet(x-1)*x; 
			
			/*hier findet nochmals ein Funktionsaufruf
			 * derselben Funktion/Methode statt.
			 */
			
		}
		
	}
}
