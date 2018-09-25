import java.util.Scanner;

public class SandwichSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		double price = 0;
		String sandwichString = null;
		
		System.out.println("Pick your sandwich: ");
		int choice = in.nextInt();
		
		
		switch (choice) {
		
			case 1: sandwichString = "Pastrami";
				price = 4.50;
				break;
			case 2: sandwichString = "Turkey";
				price = 5.00;
				break;
			case 3: sandwichString = "Ham and Cheese";
				price = 5.25;
				break;
			case 4: sandwichString = "Italian";
				price = 6.50;
				break;
				default:
			System.out.println("Invalid choice.");
		}
	System.out.printf("You picked %s and it costs: $%.2f",sandwichString,price);
	}

}
