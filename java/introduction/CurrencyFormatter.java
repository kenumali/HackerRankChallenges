import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/*
Link to problem: https://www.hackerrank.com/challenges/java-currency-formatter
*/

public class CurrencyFormatter {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
    double payment = scanner.nextDouble();
    scanner.close();

    Locale inLocale = new Locale("en", "in");
    String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
    String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);
    String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
    String india = NumberFormat.getCurrencyInstance(inLocale).format(payment);

    System.out.println("US: " + us);
    System.out.println("India: " + india);
    System.out.println("China: " + china);
    System.out.println("France: " + france);
	}
}
