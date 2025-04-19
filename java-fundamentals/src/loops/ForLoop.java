package loops;

public class ForLoop {

  public static void main(String[] args) {
    // for loop
    int i;
    for(i=0 ; i<=10; i++) {
      System.out.println(i);
    }
    System.out.println(i);

    for(byte b = 10; b > 0; b++) {  // this is not an infinite loop as byte will at some point will become negative that is after 127
      System.out.println(b);
    }

    int c = 0;
    for(;c<=10;c++) {
      System.out.println(c);
    }

    int d = 0;
    for(System.out.println("Hi");d<=10;d++) {
      System.out.println(d);
    }

    // int j = 0;
    // for(;j<=10;) {   // infinite loop printing 0's
    //   System.out.println(j);
    // }

    int k = 0;
    for(;k<=10;) {
      System.out.println(k);
      k++;
    }


    for(int p=0, q=1; p<=10; p++, q=q*2) {
      System.out.println(p+" "+q);
    }

    for(int p=0, q=1; p<=10 && q<=4; p++, q=q*2) {
      System.out.println(p+" "+q);
    }
    
    int m = 0;
    for(;;) {  // infinite loop
      System.out.println(m);
      m++;
    }
  }
  
}
