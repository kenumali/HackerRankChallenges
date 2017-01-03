import java.util.Scanner;

/*
Link to problem: https://www.hackerrank.com/challenges/java-string-reverse
*/

public class StringReverse {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String A=sc.next();
		if(A.length() <= 50) {
			System.out.println(A.equalsIgnoreCase(new StringBuffer().append(A).reverse().toString()) ? "Yes" : "No");
		}
		sc.close();
	}
}
