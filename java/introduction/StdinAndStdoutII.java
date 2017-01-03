import java.util.Scanner;

/*
Link to problem: https://www.hackerrank.com/challenges/java-stdin-stdout
*/

public class StdinAndStdoutII {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int i = scan.nextInt();
    scan.nextLine(); //discards new line
    double d = scan.nextDouble();
    scan.nextLine(); //discards new line
    String s = scan.nextLine();
    scan.close();
    
    System.out.println("String: " + s);
    System.out.println("Double: " + d);
    System.out.println("Int: " + i);
  }
}
