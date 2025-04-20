package methods;

public class Methods {
  /*static*/ int max(int x, int y) {
    if(x>y) {
      return x;
    } else {
      return y;
    }
  }
  public static void main(String[] args) {
    int a =10, b = 15, c;
    // c = max(a,b);
    // System.out.println(c);
    //System.out.println(max(a, b));

    // if you dont want to make the max method static create this class object and then call method on that object
    Methods m = new Methods();
    System.out.println(m.max(a, b));
    inc(a);
    System.out.println("a is " + a);
  }

  static void inc(int x) {
    x++;
    System.out.println("x is "+ x);
  }
}
