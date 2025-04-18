package conditionals.switchcase;

import java.util.Scanner;

public class MenuDrivenProgram {
  public static void main(String[] args) {
    // make a menu driven program for arithmetic operations
    System.out.println("Menu");
    System.out.println("==========");
    System.out.println("1.ADD");
    System.out.println("2.SUB");
    System.out.println("3.MUL");
    System.out.println("4.DIV");
    System.out.println("Enter 2 numbers");
    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt(), b = sc.nextInt();
    System.out.println("Enter option from the above list in words : ");
    sc.nextLine();
    String option = sc.nextLine();
    switch (option) {
      case "ADD":
        System.out.println(a + b);
        break;
      case "SUB":
        System.out.println(a - b);
        break;
      case "MUL":
        System.out.println(a * b);
        break;
      case "DIV":
        System.out.println(a / b);
        break;
      default:
        System.out.println("Invalid option");
        break;
    }

  }
}
