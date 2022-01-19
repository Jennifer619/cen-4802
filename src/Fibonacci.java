/**
 * @author jenni
 *
 */
public class Fibonacci {
	// recursive method
	/**
	 * @param n
	 * @return nth integer of fibonacci sequence
	 */
	public static int fib (int n) { 
		if (n <= 1) {
			return n;
		} 
		return fib(n - 1) + fib(n - 2);
	}
	// main method
	
	/**
	 * @param args
	 * takes n integer value and outputs it in text
	 */
	public static void main (String args[]) {
		int n = 10;
		System.out.println("The 10th integer in the Fibonacci sequence is: " + fib(n));
	}
}
