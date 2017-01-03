import java.util.Scanner;

/*
Link to problem: https://www.hackerrank.com/challenges/java-loops
*/

public class LoopsII {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int t=in.nextInt();
    int finalN = 0;
    for(int i=0;i<t;i++){
      int a = in.nextInt();
      int b = in.nextInt();
      int n = in.nextInt();
      finalN = a;
      for(int j=0; j<n; j++) {
        finalN += (int) (Math.pow(2, j) * b);
        System.out.print(finalN + " ");
      }
      System.out.println();
    }
    in.close();
  }
}
