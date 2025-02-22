package conditionals;

public class ConditionalStatement {
  public static void main(String[] args) {
    int n =5;
    if(n>=0){
      System.out.println("Positive");
    } else {
      System.out.println("Negative");
    }

    // max of 3 no.s
    int a = 5, b=15, c= 4;
    if(a>b&&a>c) {
      System.out.println(a);
    } else if(b>c) {
      System.out.println(b);
    } else {
      System.out.println(c);
    }
  }
}
