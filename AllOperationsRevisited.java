import java.util.Scanner;

class Operations {
	int x;
	
	public void add(int num1, int num2) {
		x = num1 + num2;
		System.out.println("Sum is: "+ x);
	}
	public void diff(int num1, int num2) {
		x = num1 - num2;
		System.out.println("Difference is: "+ x);
	}
		
}
	
public class AllOperationsRevisited extends Operations {  //adds mult/div operations to base class
	
	public void mult(int num1, int num2) {
		x = num1*num2;
		System.out.println("Product is: "+ x);
	}
	
	public void div(int num1, int num2) {
		x = num1/num2;
		System.out.println("Quotient is: "+ x);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		
	}

}
