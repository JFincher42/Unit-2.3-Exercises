import java.util.Scanner;

public class ConsoleExercise2 {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		
		System.out.print("Enter two integers: ");
		int num1 = console.nextInt();
		int num2 = console.nextInt();
		String waste = console.nextLine();
		
		System.out.println("The product of " + num1 + " and " + num2 + " is " + (num1*num2));
		System.out.println("<" + waste + ">");
	}

}
