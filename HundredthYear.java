import java.util.Scanner;
import java.time.Year;


public class HundredthYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your age to find year at 100: ");
		int age = in.nextInt();
		int current_year = Year.now().getValue();
		int year = 100 - age;
		int year_100 = current_year + year;
		int year_birth = current_year - age;
		
		System.out.printf("You were born in %d\n",year_birth);
		System.out.printf("You will turn 100 in %d years in %d", year,year_100);
		
	}
		

}
