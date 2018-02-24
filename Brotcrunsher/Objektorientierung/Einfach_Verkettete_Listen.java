
public class Einfach_Verkettete_Listen {
	String s;
	Einfach_Verkettete_Listen next;
	
	public Einfach_Verkettete_Listen(String s){
		this.s = s;
		next = null;
	}
	public boolean hasNext(){
		if(this.next == null){
			return false;
		}
		else
		{
			return true;
		}
	}
}

