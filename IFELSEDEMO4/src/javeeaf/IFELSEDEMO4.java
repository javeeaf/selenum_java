package javeeaf;

public class IFELSEDEMO4 {
	
	public static void main(String[] args) {
		int a = 5;
		int b = 5;
		int c = 6;
		int d = 7;	
		
		
		if(!(a==b&&c==d)||c==d) {  // true && false => false || false
			
			System.out.println("id executes");
		}
		else {
			System.out.println("else executes");
		}
	}

}

