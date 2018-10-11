import java.util.Scanner;
import java.time.Year;
import java.time.ZoneId;


public class HundredthYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		ZoneId z = ZoneId.systemDefault(); //fetches user's timezone
		int age;// = in.nextInt();
		int current_year;// = Year.now().getValue();
		int year;// = 100 - age;
		int year_100;// = current_year + year;
		int year_birth;// = current_year - age;
		
		System.out.print("Enter your age (0-100) to find year at 100: ");
		age = in.nextInt();
	
		current_year = Year.now(z).getValue();
		year = 100 - age;
		year_100 = current_year + year;
		year_birth = current_year - age;
		
		
		while ((age < 0) || (age > 100)) {
			System.out.print("Age not in range, please enter valid age: ");
			age = in.nextInt();
			
			current_year = Year.now(z).getValue();
			year = 100 - age;
			year_100 = current_year + year;
			year_birth = current_year - age;
		}
		
		System.out.printf("You were born in %d\n",year_birth);
		System.out.printf("You will turn 100 in %d years in %d", year,year_100);
		
	}
		

}
