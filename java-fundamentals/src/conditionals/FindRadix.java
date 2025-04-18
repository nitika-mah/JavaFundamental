package conditionals;
import java.util.Scanner;

public class FindRadix {

  public static void main(String[] main) {
    // Find radix of a number given in a string
    // String num = "1010110"; binary 2
              //  = "12357"; octal 8
              //  = "A25B" Hexa 16
              //  = "25978" decimal 10

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a string containing numbers");
    String num = sc.nextLine();
    if(num.matches("[01]+")) {
      System.out.println("Radix : 2 (Binary)");
    } else if(num.matches("[0-7]+")) {
      System.out.println("Radix : 8 (Octal)");
    } else if(num.matches("[0-9]+")) {
      System.out.println("Radix : 10 (Decimal)");
    } else if(num.matches("[0-9A-Fa-f]+")) {
      System.out.println("Radix : 16 (Hexadecimal)");
    } else {
        System.out.println("Invalid number");
    }

    // find a given year is a leap year
    System.out.println("Enter a year and we will let youb know if its a leap year or not");  
    int year = sc.nextInt();
    // if(year%4==0) {
    //   if(year%100!=0) {
    //     System.out.println("Leap year");
    //   } else if(year%400==0) {
    //     System.out.println("Leap year");
    //   } else {
    //     System.out.println("Not a Leap year");
    //   }
    // } else {
    //   System.out.println("Not a leap year");
    // }

    if(year%4==0) {
      if(year%100==0){
        if(year%400==0) {
          System.out.println("leap year");
        } else {
          System.out.println("Not a leap year");
        }
      } else {
        System.out.println("leap year");
      }
    } else {
      System.out.println("Not a leap year");
    }

  }
  
}
