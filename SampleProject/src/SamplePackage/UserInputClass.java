


package SamplePackage;
import java.util.Scanner;
public class UserInputClass {
	
	public static void main (String[] args) {
		
		Scanner input = new Scanner(System.in);
		

		System.out.println("Please enter your name : ");
		String s = input.next(); // getting a String value

		System.out.println("Please enter your last name : ");
		 String i = input.next(); // getting an integer
		 
		 System.out.println("your full name is : " +s.concat(i));

		 input.close();
	}
}
	


