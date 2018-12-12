//test class for base class (AllOperationsRevisited)

import org.junit.Test;

public class TestAllOperationsRevisited {

	@Test  //tests basic addition method works for positive sums
	public void testSimplePositiveSum() {
		Operations allOps = new AllOperationsRevisited();  //AllOperationsRevisited inherits from Operations
		assert(allOps.add(1, 1) == 2);
	}
	
	@Test  //tests basic addition method works for negative sums
	public void testSimpleNegativeSum() {
		Operations allOps = new AllOperationsRevisited();
		assert(allOps.add(-1, -1) == -2);
	}

	@Test  //tests subtraction method works for positive differences
	public void testSimplePositiveDiff() {
		Operations allOps = new AllOperationsRevisited();
		assert(allOps.diff(2, 1) == 1);
	}
	
	@Test  //tests subtraction method works for negative differences
	public void testSimpleNegativeDiff() {
		Operations allOps = new AllOperationsRevisited();
		assert(allOps.diff(1, 2) == -1);
	}
	
	@Test  //positive times positive equals positive number
	public void testSimplePositiveMult() {
		AllOperationsRevisited allOpsRe = new AllOperationsRevisited();
		assert(allOpsRe.mult(1, 2) == 2);
	}
	
	@Test //negative times negative equals positive answer
	public void testSimpleTwoNegativeMult() {
		AllOperationsRevisited allOpsRe = new AllOperationsRevisited();
		assert(allOpsRe.mult(-1, -2) == 2);
	}
	
	@Test  //negative times positive equals negative number
	public void testSimpleNegativeMult() {
		AllOperationsRevisited allOpsRe = new AllOperationsRevisited();
		assert(allOpsRe.mult(-1, 2) == -2);
	}
	
	@Test  //two positive numbers divided equals positive number
	public void testSimplePositiveDiv() {
		AllOperationsRevisited allOpsRe = new AllOperationsRevisited();
		assert(allOpsRe.div(4, 2) == 2);
	}
	
	@Test  //two negative numbers divided equals positive number
	public void testSimpleNegativeDiv() {
		AllOperationsRevisited allOpsRe = new AllOperationsRevisited();
		assert(allOpsRe.div(-4, -2) == 2);
	}
	
	@Test  //negative divided by positive equals negative number
	public void testSimpleTwoNegativeDiv() {
		AllOperationsRevisited allOpsRe = new AllOperationsRevisited();
		assert(allOpsRe.div(-4, 2) == -2);
	}
	
	@Test(expected = java.lang.ArithmeticException.class)  //divide by 0 invalid operation
	public void testDivideByZero() {
		AllOperationsRevisited allOpsRe = new AllOperationsRevisited();
		try {
			System.out.println(allOpsRe.div(2, 0));
		} catch (IllegalArgumentException e) {
			 e.printStackTrace();
		}
	}
	
	@Test  //modulus (remainder) function works as expected
	public void testSimpleMod() {
		AllOperationsRevisited allOpsRe = new AllOperationsRevisited();
		assert(allOpsRe.mod(9, 4) == 1);
	}
}
