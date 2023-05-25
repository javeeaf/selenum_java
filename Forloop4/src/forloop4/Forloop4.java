package forloop4;

public class Forloop4 {
	
public static void main(String[] args) {
		
		int count = 0;  
		
		for(int i=1;i<=100;i++) {
			
			if(i%2!=0) {
				++count;
			}
		}	
		System.out.println("count of odd number " +count);
	}

}
