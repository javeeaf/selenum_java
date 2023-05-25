package assignment_operator;

public class Assignment_operator {
		  public static void main(String[] args) {
		    
		    // create variables
		    int a = 10;
		    int var;

		    // assign value using =
		    var = a;
		    System.out.println("var using =: " + var);

		    // assign value using =+
		    var += a;
		    System.out.println("var using +=: " + var);

		    // assign value using =*
		    var *= a;
		    System.out.println("var using *=: " + var);
		  }
}