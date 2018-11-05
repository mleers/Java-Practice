class Outer {
	void outerMethod() {
		final int secret_num = 42;
		System.out.println("Were you looking for the secret number?");
		class Inner {
			void innerMethod() { //innner method accessing private instance variable, 42
				System.out.printf("Well here it is: " + secret_num);
			}
		}
		Inner z = new Inner(); //declare reference var z, instantiation allocates reference, initialization
		z.innerMethod();
		}
	}

public class InnerMethodClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer x = new Outer();
		x.outerMethod();
	}

}
