package loops;

import java.util.Scanner;

public class ReverseANumber {
  public static void main(String[] args) {
    System.out.println("Enter a number to reverse : ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int reverse = 0;
    while(n != 0) {
      int r = n%10;   // 1, 7, 3
      n = n/10;   // 37, 3, 0
      reverse = r + reverse*10;  // 1 , 17, 173
    }
    System.out.println(reverse);
  }
}
