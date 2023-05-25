package loop2;

import java.util.Scanner;

public class INFINITELOOP {
	
public static void main(String[] args) {
		
		try (Scanner read = new Scanner(System.in)) {
			System.out.println("Please enter the phonenumber");
			
			long userInputNumber = read.nextLong(); // long local variable used to save phone number
			
			long number = 8667701821L;  
				
			while(userInputNumber!=number) { 
				
				System.out.println("Wrong number");
				
			}
		}
		
		System.out.println("Password accepted");
	
		
	}

}
