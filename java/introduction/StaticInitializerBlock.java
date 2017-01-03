import java.util.Scanner;

/*
Link to problem: https://www.hackerrank.com/challenges/java-static-initializer-block
*/

public class StaticInitializerBlock {
  static Scanner sc = new Scanner(System.in);
  static int B = sc.nextInt();
  static int H = sc.nextInt();
  static boolean flag = true;
  static {
    try {
      if (B <= 0 || H <= 0) {
        flag = false;
        throw new Exception();
      }
    } catch (Exception ex) {
      System.out.println("java.lang.Exception: Breadth and height must be positive");
    }
  }

  public static void main(String[] args) {
    if (flag) {
      int area = B * H;
      System.out.println(area);
    }
  }
}
