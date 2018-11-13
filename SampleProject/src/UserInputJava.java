import java.util.Scanner;


public class UserInputJava {
	
public static void main (String[] args) {
		
		Scanner input = new Scanner(System.in);
		

		System.out.println("Please enter your name : ");
		String s = input.next(); // getting a String value

		System.out.println("Please enter your age : ");
		 int i = input.nextInt(); // getting an integer

		System.out.println("Please enter your salary : ");
		double d = input.nextDouble(); // getting a double
	}


}
