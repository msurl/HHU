import java.util.ArrayList;
import java.util.List;

public class Listen {
	public static void main(String args[]){
		List<Integer> list = new ArrayList<Integer>();
		list.add(13);
		list.add(32871);
		list.add(321);
		list.add(12);
		list.add(13);
		list.remove(1);
		System.out.println(list.get(4));
	}

}
