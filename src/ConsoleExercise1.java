import java.util.Scanner;

public class ConsoleExercise1 {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		
		System.out.print("Hello, what is your name? ");
		String userName = console.next();
		System.out.println("Hello " + userName + "!  Nice to meet you!");

	}

}
