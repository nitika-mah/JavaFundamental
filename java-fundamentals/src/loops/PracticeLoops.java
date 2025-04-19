package loops;
import java.util.*;

public class PracticeLoops {
  public static void main(String[] args) {
    // Display multiplication table
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number");
    int m = sc.nextInt();
    for(int i = 1; i<=10; i++) {
      System.out.println(m +"*" +i +"="+m*i);
    }

    // find sum of first n natural numbers
    int n = sc.nextInt();
    int sum = 0;
    for(int i = 1; i <= n; i++) {
      sum = sum+i;
    }
    System.out.println(sum);

    // Factorial of a number 
    int num = sc.nextInt();
    int factorial = 1;
    for(int i = num; i >= 1; i--) {
      factorial = factorial*i;
    }
    System.out.println(factorial);
  }
}
