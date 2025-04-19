package loops;

public class Fibonacci {
  public static void main(String[] args) {
    int a = 5, d = 3, n = 5;
    System.out.println("AP series is : ");
    for(int i = 0; i<n; i++) {
      System.out.print(a+i*d + ", ");
    }

    a = 2; int r = 3; n = 5;
    int term = a;
    System.out.println("GP series is : ");
    for(int i = 0; i<n; i++) {
      System.out.print(term + ", ");
      term = term*r;
    }

    // Fibonacci series : 0, 1, 1, 2, 3, 5, 8, 13, 21,...
    a = 0; int b = 1; n = 10;
    System.out.println("Fibonacci series : ");
    System.out.print(a + ", "+ b + ", ");
    for(int i = 3; i<=n; i++) {
      int c = a+b;
      System.out.print(c + ", ");
      a = b;
      b = c;

    }

  }
}
