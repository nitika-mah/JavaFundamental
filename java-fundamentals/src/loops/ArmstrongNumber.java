package loops;
import java.util.*;

public class ArmstrongNumber {
  public static void main(String[] args) {
    // Display digits of a number and count number of digits
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt(); // n = 371 371/10 = 37/10 = 3/10 = 0
    System.out.println("Digits are: ");
    int countOfDigits = 0;
    while(n != 0) {
      int r = n%10;
      n = n/10;
      System.out.print(r + " ");
      countOfDigits++;
    }
    System.out.println("Number of digits in the number is : "+ countOfDigits);

    // armstrong number
    int sum = 0;
    System.out.println("Enter the number to check if its an armstrong number : ");
    int num = sc.nextInt();
    int m = num;
    while(num != 0) {
      int r = num%10;
      num = num/10;
      sum = (int)Math.pow(r, countOfDigits) + sum;
    } 
    System.out.println("sum : " + sum);
    if(sum == m) {
      System.out.println("Yes! its an armstrong number");
    } else {
      System.out.println("Not an armstrong number");
    }

  }
}
