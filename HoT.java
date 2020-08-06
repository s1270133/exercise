import java.util.Random;

public class Heads_or_Tail {
	public static void main(String[] args) {
		String[] HoT = {"Heads", "Tails"};
		String result;
		Random r = new Random();
		int i = 0, h = 0, t = 0;
		
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
	}
}
