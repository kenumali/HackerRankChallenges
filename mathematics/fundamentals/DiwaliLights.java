import java.util.Scanner;
import java.math.BigInteger;

public class DiwaliLights {
	final static BigInteger BULB_STATUS = BigInteger.valueOf(2);
	final static BigInteger OFF = BigInteger.ONE;
	final static BigInteger MODULUS = BigInteger.valueOf(100000);
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testCases = scanner.nextInt();
		for(int i = 0; i < testCases; i++) {
			System.out.println(BULB_STATUS.pow(scanner.nextInt()).subtract(OFF).mod(MODULUS));
		}
		scanner.close();
	}
}
