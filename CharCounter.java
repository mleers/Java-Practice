import java.util.Scanner;

public class CharCounter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a few words: ");
		String input = in.nextLine();
		
		read(input);
	}

	public static void read(String input) {
		// TODO Auto-generated method stub
		char[] ch = input.toCharArray();
		int letter = 0;
		int space = 0;
		int num = 0;
		int other = 0;
		int total = 0;
		
		for(int i = 0; i < input.length(); i++) {
			if(Character.isLetter(ch[i])) {
				letter++;
			}
				else if(Character.isSpaceChar(ch[i])) {
					space++;
				}
				else if(Character.isDigit(ch[i])) {
					num++;
				}
				else {
					other++;
			}
		total = letter + space + num + other;
		}	
		
		
		System.out.printf("Your input of: %s has %d characters\n",input,total);
		System.out.println("Number of letters is: " + letter);
		System.out.println("Number of spaces is: " + space);
		System.out.println("Number of numbers is: " + num);
		System.out.println("Number of other characters is: " + other);
	
	}
}


