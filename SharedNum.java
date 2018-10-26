import java.util.Scanner;

public class SharedNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Enter first number (0-100): ");
		int num1 = in.nextInt();
		System.out.print("Enter second number (0-100): ");
		int num2 = in.nextInt();
		
		System.out.println("Common digit?: " + shared_num(num1, num2));
	}

	public static boolean shared_num(int a, int b) {
		
		if (a < 0 || b > 100)
			return false;
		int x = a % 10;
		int y = b % 10;
		a /= 10;
		b /= 10;
		return (a == b || a == y || x == b || x == y);
		
	}
}