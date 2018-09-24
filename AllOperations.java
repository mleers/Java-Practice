import java.util.Scanner;

public class AllOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter first number: ");
		int num1 = in.nextInt();
		
		System.out.println("Enter second number: ");
		int num2 = in.nextInt();
		
	System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
	System.out.println(num1 + " x " + num2 + " = " + (num1*num2));
	System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
	System.out.println(num1 + " / " + num2 + " = " + (num1/num2));
	System.out.println(num1 + " mod " + num2 + " = " + (num1%num2));
	}

}
