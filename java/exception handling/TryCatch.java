import java.util.InputMismatchException;
import java.util.Scanner;

/*
Link to problem: https://www.hackerrank.com/challenges/java-exception-handling-try-catch
*/

public class TryCatch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			int x = sc.nextInt();
			int y = sc.nextInt();
			System.out.println(x / y);
		} catch (InputMismatchException ex) {
			System.out.println("java.util.InputMismatchException");
		} catch (ArithmeticException ex) {
			System.out.println("java.lang.ArithmeticException: / by zero");
		}
		sc.close();
	}
}
