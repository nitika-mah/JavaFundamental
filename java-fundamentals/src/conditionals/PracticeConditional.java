package conditionals;

import java.util.Scanner;

public class PracticeConditional {
  public static void main(String[] args) {
    // find a number is odd or even
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter a number and we will tell if its even or odd : ");
    int n = sc.nextInt();
    if(n%2==0) {
      System.out.println("It's an even number!");
    } else {
      System.out.println("It's an odd number!");
    }

    // find person is young or not young 
    // 14-55 : person is young
    System.out.println("If you dont mind please enter your age :)");
    int age = sc.nextInt();
    if(age>=14 && age<=55) {
      System.out.println("Yay! you are young :)");
    } else {
      System.out.println("Umm.. you are a kid or an old kid!");
    }

    // find grades for given marks // take marks of 3 subjects and find average and then grade accoeding if avg>=70:A , 60=<avg<70: B...
    System.out.println("Enter your marks for us to be able to give your grades: ");
    int m1 = sc.nextInt(), m2 = sc.nextInt(), m3 = sc.nextInt();
    int avg = (m1+m2+m3)/3;
    System.out.println("avg marks : "+avg);
    if(avg>=70) {
      System.out.println("A");
    } else if (avg<70 && avg>=60) {
      System.out.println("B");
    } else if (avg<60 && avg>=50) {
      System.out.println("C");
    } else if(avg<50 && avg>=40) {
      System.out.println("D");
    } else {
      System.out.println("F");
    }

  }
  
}
