package loops.patterns;

public class Patterns2 {
  public static void main(String[] args) {
    // for(int i = 1; i<=5; i++) {
    //   for(int j = 1; j<=5; j++) {
    //     if(i>=j){
    //       System.out.print(j + " ");
    //     }
    //   }
    //   System.out.println();
    // }
    for(int i = 1; i<=5; i++) {
      for(int j = 1; j<=i; j++) {
          System.out.print(j + " ");
      }
      System.out.println();
    }

    System.out.println();

    int count=0;
    for(int i = 1; i<=5; i++) {
      for(int j = 1; j<=i; j++) {
        count++;
        System.out.print(count + " ");
      }
      System.out.println();
    }

    System.out.println();

    for(int i = 1; i<=5; i++) {
      for(int j = 1; j<=i; j++) {
          System.out.print("* ");
      }
      System.out.println();
    }

    for(int i = 1; i<=5; i++) {
      for(int j= 1; j<=5-i+1; j++){
        System.out.print(j + " ");
      }
      System.out.println();
    }

  }
}
