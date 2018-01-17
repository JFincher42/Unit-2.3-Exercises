import java.util.Scanner;

public class HW2Quadratic {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		
		System.out.print("Enter a, b, and c from your polynomial: ");
		double a = console.nextDouble();
		double b = console.nextDouble();
		double c = console.nextDouble();

		double x1 = (-b + Math.sqrt(b*b - 4*a*c)) / (2*a);
		double x2 = (-b - Math.sqrt(b*b - 4*a*c)) / (2*a);
		
		System.out.println("Your roots are " + x1 + " and " + x2);
	}

}
