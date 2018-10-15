import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class IPRegex {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter an IP address: ");
		
		String input = in.nextLine();
		String ip_pattern =  "(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)";
        //regex for IPV4: 0.0.0.0 - 255.255.255.255
		Pattern r = Pattern.compile(ip_pattern);
        Matcher m = r.matcher(input);
        
        
        if (m.matches()) {
        	System.out.println("Valid IP");
        }else {
        	System.out.println("Not valid");
        }
    }
	
}