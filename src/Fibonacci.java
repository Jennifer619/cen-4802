
public class Fibonacci {
	// recursive method
	public static int fib (int n) { 
		if (n <= 1) {
			return n;
		} 
		return fib(n - 1) + fib(n - 2);
	}
	// main method
	public static void main (String args[]) {
		int n = 10;
		System.out.println("The 10th integer in the Fibonacci sequence is: " + fib(n));
	}
}
