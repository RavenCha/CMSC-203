package CMSC203_ACTIVITY2;

import java.util.Scanner; 

public class activity2 {
	


	
	public static void main(String[] args) {
		
		float enter1;
		float enter2;
		float result;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("==================");
		System.out.print("First Number : ");
		enter1 = s.nextFloat();
		
		System.out.print("Second Number : ");
		enter2 = s.nextFloat();
		
		System.out.println("==================");
		result = enter1 + enter2;
		
	
		System.out.println(enter1 + " + " + enter2 + " = " + result);
		System.out.println("==================");
	}

}