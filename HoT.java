import java.util.Random;
import java.util.Scanner;

public class Heads_or_Tail {
	public static void main(String[] args) {
		String[] HoT = {"Heads", "Tails"};
		String result;
		String name;
		Random r = new Random();
		int i = 0, h = 0, t = 0;
		
		System.out.println("Who are you?");
		name = new Scanner(System.in).nextLine();
		System.out.println("Hello, " + name + "!");
		
		System.out.println("Tossing a coin...");
		
		for(i = 0; i < 3; i++) {
			result = HoT[r.nextInt(2)];
			if (result == "Heads")
				h++;
			else 
				t++;
			
			System.out.println("Round " + i + ": " + result);
		}
		
		System.out.println("Heads: " + h + ", Tails: " + t);

		if(h > t)
			System.out.println(name + " won!");
		
		else
			System.out.println(name + " lost");
	}
}
