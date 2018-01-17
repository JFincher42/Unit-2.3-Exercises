import java.util.Scanner;

public class HW1Random {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		
		System.out.println("Enter two integers: ");
		int lower = console.nextInt();
		int upper = console.nextInt();
		
		int randInt = (int)((upper - lower)*Math.random()+lower);
		System.out.println("A random integer between " + lower + " and " + upper + " is " + randInt);

	}

}
