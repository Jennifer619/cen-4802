/**
 * @author Jennifer Miller
 *
 */
public class Fibonacci {
	// recursive method
	/**
	 * retrieves data of fibonacci sequence
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
	 * takes n integer value and outputs it in text
	 * @param args
	 * @return none
	 */
	public static void main (String args[]) {
		int n = 10;
		System.out.println("The 10th integer in the Fibonacci sequence is: " + fib(n));
	}
}
