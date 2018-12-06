//base class, continuation

import java.util.Scanner;

class Operations {
	int x;
	
	public int add(int num1, int num2) {
		x = num1 + num2;
		System.out.println("Sum is: "+ x);
		return x;
	}
	public int diff(int num1, int num2) {
		x = num1 - num2;
		System.out.println("Difference is: "+ x);
		return x;
	}	
}
	
public class AllOperationsRevisited extends Operations {  //adds mult/div/mod operations to base class
	
	public int mult(int num1, int num2) {
		x = num1*num2;
		System.out.println("Product is: "+ x);
		return x;
	}
	
	public int div(int num1, int num2) {
		x = num1/num2;
		System.out.println("Quotient is: "+ x);
		return x;
	}
	
	public int mod(int num1, int num2) {
		x = num1%num2;
		System.out.println("Modulus (remainder) is: "+ x);
		return x;
	}
	

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter first number: ");
		int num1 = in.nextInt();
		
		System.out.println("Enter second number: ");
		int num2 = in.nextInt();
		AllOperationsRevisited compute = new AllOperationsRevisited();  //accessing subclass via method
		compute.add(num1,num2);
		compute.diff(num1, num2);
		compute.mult(num1, num2);
		compute.div(num1, num2);
		compute.mod(num1, num2);
	}
}
