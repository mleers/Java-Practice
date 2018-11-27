import java.util.Scanner;

class IntToX extends NumConverter {  //converts integer to binary, octal and hex
	public void  numToX(Scanner w) {
		System.out.println("Enter integer: ");
		int num1 = w.nextInt();
		System.out.println("Binary: "+(Integer.toBinaryString(num1)));
		System.out.println("Octal: "+(Integer.toOctalString(num1)));
		System.out.println("Hexadecimal: "+(Integer.toHexString(num1)));
		System.out.println();  //newline for binary prompt
	}
}

class BinToX extends NumConverter {  //converts binary to integer, octal and hex
	public void binToX(Scanner x) {
		System.out.println("Enter binary: ");
		String num2 = x.next();
		int num2_int = Integer.parseInt(num2,2);  //back-converts to integer to plug into next conversions 
		System.out.println("Integer: "+(Integer.parseInt(num2,2)));
		System.out.println("Octal: "+(Integer.toOctalString(num2_int)));
		System.out.println("Hexadecimal: "+(Integer.toHexString(num2_int)));
		System.out.println();  //newline for octal prompt
	}
}

class OctToX extends NumConverter {  //converts octal to integer, binary and hex
	public void octToX(Scanner y) {
		System.out.println("Enter octal: ");
		String num3 = y.next();
		int num3_int = Integer.parseInt(num3,8);  //oct to int, feeds next conversions
		System.out.println("Integer: "+(Integer.parseInt(num3,8)));
		System.out.println("Binary: "+((Integer.toBinaryString(num3_int))));
		System.out.println("Hexadecimal: "+(Integer.toHexString(num3_int)));
		System.out.println();  //newline for hex prompt
	}
}

class HexToX extends NumConverter {  //converts hex to integer, binary, octal
	public void hexToX(Scanner z) {
		System.out.println("Enter hex: ");
		String num4 = z.next();
		int num4_int = Integer.parseInt(num4,16);  //hex to int, feeds next conversions
		System.out.println("Integer: "+(Integer.parseInt(num4,16)));
		System.out.println("Binary: "+((Integer.toBinaryString(num4_int))));
		System.out.println("Octal: "+(Integer.toOctalString(num4_int)));
	}
}

public class NumConverter {
	
	public static void main(String[] args) {
		Scanner int_to = new Scanner(System.in);  //multiple scanners for each class' conversion(s)
		Scanner bin_to = new Scanner(System.in);
		Scanner oct_to = new Scanner(System.in);
		Scanner hex_to = new Scanner(System.in);
		
		IntToX i = new IntToX();
		i.numToX(int_to);
	
		BinToX b = new BinToX();
		b.binToX(bin_to);
		
		OctToX o = new OctToX();
		o.octToX(oct_to);
		
		HexToX h = new HexToX();
		h.hexToX(hex_to);
	}
}
