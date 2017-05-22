import java.util.Scanner;
import java.math.BigInteger;

public class SummingTheNSeries {
	
	final static BigInteger MODULUS = BigInteger.valueOf(1000000007);
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testCases = scanner.nextInt();
		for(int i = 0; i < testCases; i++) {
			System.out.println(scanner.nextBigInteger().pow(2).mod(MODULUS));
		}
		scanner.close();
	}
}
