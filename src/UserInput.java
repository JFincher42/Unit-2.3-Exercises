import java.util.Scanner;
import java.io.File;

public class UserInput {

	public static void main(String[] args){
		Scanner console;
		console = new Scanner(System.in);
		
		System.out.print("Type an integer between 1 and 10: ");
		int number = console.nextInt();
		
		System.out.print("Type your favorite color: ");
		String color = console.next();
		
		System.out.print("Enter as many digits of pi as you know: ");
		double pi = console.nextDouble();
		
		System.out.print("Number: " + number + ", color: " + color + ", pi: " + pi);
		
		console.close();
	}

}
