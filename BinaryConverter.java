import java.util.Scanner;

public class BinaryConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter integer: ");
		int num = in.nextInt();
		
		System.out.println(Integer.toBinaryString(num));
		
	}

}
