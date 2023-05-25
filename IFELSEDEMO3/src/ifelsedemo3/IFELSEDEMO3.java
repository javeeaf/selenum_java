package ifelsedemo3;
import java.util.Scanner;
public class IFELSEDEMO3 
{
public static void main(String[] args) {

	try (Scanner read = new Scanner(System.in)) {
		System.out.print("Enter any number: ");
		int num = read.nextInt();
		
		if((num % 2) != 0) {
			System.out.println("Given number is odd number!!");
		}
		else {
			System.out.println("Given number is even number!!");
		}
	}
	}}
