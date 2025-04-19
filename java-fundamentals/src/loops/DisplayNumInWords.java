package loops;
import java.util.*;

public class DisplayNumInWords {
  // Display number in words : 1700 -> one seven zero zero 
  // so for this we would reverse the number and store it in a string to consider tailing zeroes
  public static void main(String[] args) {
    System.out.println("Enter a number  :");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String str = "";
    String s = String.valueOf(n);
    for(int i = 0; i<s.length(); i++) {
      InWords(s.charAt(i));
    }
    sc.close();
    // while(n != 0) {
    //   int r = n%10;
    //   str = str + r;
    //   n = n/10;
    // }

    // System.out.println("str is " + str); // '0071'
    // for(int i = str.length()-1; i >= 0; i--) {
    //   InWords(str.charAt(i));
    // }
  }

  public static void InWords(char ch) {
    switch (ch) {
      case '0' : System.out.print("zero ");
      break;
      case '1' : System.out.print("one ");
      break;
      case '2' : System.out.print("two ");
      break;
      case '3' : System.out.print("three ");
      break;
      case '4' : System.out.print("four ");
      break;
      case '5' : System.out.print("five ");
      break;
      case '6' : System.out.print("six ");
      break;
      case '7' : System.out.print("seven ");
      break;
      case '8' : System.out.print("eight ");
      break;
      case '9' : System.out.print("nine ");
      break;

      
    }
  }
}
