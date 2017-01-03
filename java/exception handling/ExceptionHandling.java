import java.util.Scanner;

/*
Link to problem: https://www.hackerrank.com/challenges/java-exception-handling
*/

public class ExceptionHandling {
	class MyCalculator {
		public int power(int n, int p) throws Exception {
			if (n < 0 || p < 0) {
				throw new Exception("n and p should be non-negative");
			} else {
				return (int) Math.power(n,p);
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNextInt()) {
			int n = in.nextInt();
			int p = in.nextInt();
			MyCalculator my_calculator = new MyCalculator();
			try {
				System.out.println(my_calculator.power(n, p));
			} catch (Exception e) {
				System.out.println(e)
			}
		}
		in.close();
	}
}
