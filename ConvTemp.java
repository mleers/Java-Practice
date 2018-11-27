import java.util.Scanner;

public class ConvTemp {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter temperature Fahrenheit: ");
		float temp = in.nextFloat();
		float celsius = toCelsius(temp);
		System.out.printf("%.02f Fahrenheit is %.02f Celsius.%n",temp,celsius);
		
		
		System.out.println("Enter temperature Celsius: ");
		temp = in.nextFloat();
		float farenheit = toFahrenheit(temp);
		System.out.printf("%.02f Celsius is %.02f Farenheit",temp,farenheit);
			
	}
	
	
	public static float toFahrenheit(float celsius) {  //C to F conversion
		float fahrenheit = (celsius*9/5) + 32;
		return fahrenheit;
	}
	
	
	public static float toCelsius(float fahrenheit) {  //F to C conversion
		float celsius = ((fahrenheit - 32)*(5)/9);
		return celsius;
	}
	
}


