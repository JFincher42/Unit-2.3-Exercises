import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        System.out.println("Type your first and last name and your favorite number: ");
        // User enters "Jon Fincher 42"
        String first = kbd.next();
        String second = kbd.next();
        int num = kbd.nextInt();
        
        System.out.println("What is your favorite color? ");
        //String color = kbd.nextLine();
        String color = kbd.next();
        
        System.out.println("Hi " + first + " " + second + ", why do you like " + num + "?");
        System.out.println("I like " + color + " too!");
	}

}
