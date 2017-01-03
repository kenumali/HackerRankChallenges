import java.util.Scanner;
import java.util.TreeSet;

/*
Link to problem: https://www.hackerrank.com/challenges/java-string-compare
*/

public class StringCompare {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int k = sc.nextInt();
		TreeSet<String> ts = new TreeSet<String>();
		for(int i = 0; i <= s.length() - k; i++) {
			ts.add(s.substring(i, i + k));
		}
		System.out.println(ts.first());
		System.out.println(ts.last());
		sc.close();
	}
}
