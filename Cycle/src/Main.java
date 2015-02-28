import java.util.Scanner;


public class Main {
	
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("A.");
		System.out.println("Enter the number of wheels and weight of the cycle:");
		Cycle cA = new Cycle(keyboard.nextInt(), keyboard.nextInt());
		System.out.println(cA);
		System.out.println(".");
		System.out.println(".");
		System.out.println("B.");
		Cycle cB = new Cycle();
		System.out.println(cB);
		
	}

}
