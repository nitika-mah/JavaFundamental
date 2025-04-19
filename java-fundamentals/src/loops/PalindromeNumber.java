package loops;
import java.util.*;

public class PalindromeNumber {
  public static void main(String[] args) {
    System.out.println("Enter the number to check if its a palindrome : ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    if(n == reverse(n)) {
      System.out.println("Palindrome number!");
    } else {
      System.out.println("Not a palindrome number");
    }
  }

  public static int reverse(int n) {
    int reverse = 0;
    while(n != 0) {
      int r = n%10;
      reverse = reverse*10 + r;
      n = n/10;
    }
    return reverse;
  }
  
}
