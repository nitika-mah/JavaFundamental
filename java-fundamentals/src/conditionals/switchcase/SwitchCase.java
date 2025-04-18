package conditionals.switchcase;

import java.util.Scanner;

public class SwitchCase {
  public static void main(String[] args) {
    // display name of a day based on number
    System.out.println("Enter a number");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    switch (n) {
      case 1:
        System.out.println("Mon");
        break;
      case 2:
        System.out.println("Tue");
        break;
      case 3:
        System.out.println("Wed");
        break;
      case 4:
        System.out.println("Thu");
        break;
      case 5:
        System.out.println("Fri");
        break;
      case 6:
        System.out.println("Sat");
        break;
      case 7:
        System.out.println("Sun");
        break;
      default:
        System.out.println("Invalid number");
        break;
    }

    // display type of website
    String site = "http://www.google.in";
    String protocol = site.substring(0, site.indexOf(":"));
    String ext = site.substring(site.lastIndexOf(".") + 1);
    switch (protocol) {
      case "http":
        System.out.println("Hyper Text Transfer Protocol");
        break;
      case "ftp":
        System.out.println("File Transfer Protocol");
        break;
      case "https":
        System.out.println("Hyper Text Transfer Protocol Secured");
        break;
    }

    switch (ext) {
      case "com":
        System.out.println("Commercial");
        break;
      case "org":
        System.out.println("Organization");
        break;
      case "gov":
        System.out.println("Government");
        break;
    }

  }
}
