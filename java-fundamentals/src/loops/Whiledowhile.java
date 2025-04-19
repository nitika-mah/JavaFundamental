package loops;

public class Whiledowhile {
  public static void main(String[] args) {
    // while loop
    int i = 1;
    while(i < 100) {
      i = i*2;
      System.out.println(i);
    }

    // do-while
    int j = 1;
    do {
      j = j*2;
      System.out.println(j);
    } while(j < 100);

    //infinite loop
    byte k = 1;
    while(true) {
      System.out.println(k);
      k++;
    }

  }
  
}
