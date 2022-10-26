import java.util.Scanner;
public class ACTIVITY5 {

	public static void main(String[] args){
	
	
		 char operator;
		    Float int1, int2, result;

		    // create an object of Scanner class
		    Scanner input = new Scanner(System.in);

		    // ask users to enter operator
		    System.out.println("Choose an operands : +, -, *, /, %, or ^");
		    operator = input.next().charAt(0);
 
		    System.out.println("=======================");
		    
		    // ask users to enter numbers
		    System.out.println("Enter first number");
		    int1 = input.nextFloat();

		    System.out.println("Enter second number");
		    int2 = input.nextFloat();
		    
	        System.out.println("=======================");

		    switch (operator) {
		      
		      case '+':
		        result = int1 + int2;
		        System.out.println(int1 + " + " + int2 + " = " + result);
		        break;

		     
		      case '-':
		        result = int1 - int2;
		        System.out.println(int1 + " - " + int2 + " = " + result);
		        break;

		        
		      case '*':
		        result = int1 * int2;
		        System.out.println(int1 + " * " + int2 + " = " + result);
		        break;

	
		      case '/':
		        result = int1 / int2;
		        System.out.println(int1 + " / " + int2 + " = " + result);
		        break;

		  
		      default:
		        System.out.println("Invalid operator!");
		        break;
		    }

		    input.close();
		  }
		}
