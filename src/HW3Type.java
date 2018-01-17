import java.util.Scanner;

public class HW3Type {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		
		System.out.print("Enter some data: ");
		if (console.hasNextInt())
			System.out.println("Your data, " + console.nextInt() + ", is an int.");
		else if (console.hasNextDouble())
			System.out.println("Your data, " + console.nextDouble() + ", is a double.");
		else
			System.out.println("Your data, \"" + console.next() + "\", is a String.");

	}

}
