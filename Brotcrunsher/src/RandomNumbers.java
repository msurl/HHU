import java.util.Random;

public class RandomNumbers {
	public static void main (String args[]){
		Random wurfel = new Random();
		int y = wurfel.nextInt(10);
		System.out.println(y);
	
	}

}
