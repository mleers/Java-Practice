import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner; 

public class TextReader {
 
	public static void main(String[] args) throws Exception {
	
			
		String s = new String(Files.readAllBytes(Paths.get("test.txt"))); 
		System.out.println(s);
	try {
		Scanner in = new Scanner(new File("test.txt"));
		
		while(in.hasNextLine()){
		    String str = in.nextLine();
		    if(str.contains("123")) {  //"123" is checked to exist in file
		        System.out.println("String exists");
		    }    
		   }
		}catch (Exception e) {
			System.out.println(e.getClass());
		}
		
		}
		
	} 
