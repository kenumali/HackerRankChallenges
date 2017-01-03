import java.util.Scanner;

/*
Link to problem: https://www.hackerrank.com/challenges/java-string-tokens
*/

public class StringTokens {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		String delims = "[ !,?.\\_'@]+";
		String[] tokens = s.trim().split(delims);

		if (tokens.length > 0 && tokens.length < Math.pow(10, 5)) {
			System.out.println(tokens.length);
			for (int i = 0; i < tokens.length; i++) {
				System.out.println(tokens[i]);
			}
		} else if(tokens.length == 1 && tokens[0].equals("")){
			System.out.println(0);
		}
		scan.close();
	}
}
