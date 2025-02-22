package conditionals;

public class Relational {

  public static void main(String[] args) {
    int a=5, b=10, c=15;
    System.out.println(a<b);
    System.out.println(a<b && a<c);
    System.out.println(a<b && a>c);
    System.out.println(a<b || a>c);

    float x = 5.4f, y=5.5f, z = 15;
    System.out.println(x<y);

  }
  
}
