import java.util.Scanner;

public class FibonacciMethod {
	
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.println("How many Fibonacci terms would you like: ");
		int num = in.nextInt();
		fibber(num);
	}
	
	public static void fibber(int num) {
		if (num == 0) {
			System.out.println("0");
		} else if (num == 1) {
			System.out.println("1");
		} else {
			System.out.print("1 ");
			int a = 0;
			int b = 1;
			for (int i = 1; i < num; i++) {
				int nextNumber = a + b;
				System.out.print(nextNumber + " ");
				a = b;
				b = nextNumber;
			}
			
		}
		
		
	}
	
	
}