import java.io.*;
import java.util.Scanner; 
public class TextReader {
 
	public static void main(String[] args) throws Exception {
	
		Scanner in = new Scanner(new File("test.txt"));

		while(in.hasNextLine()){
		    String str = in.nextLine();
		    if(str.contains("123")) {
		        System.out.println("String exists");
		        break;
		   }
		}
			
		 
			
	} 
}