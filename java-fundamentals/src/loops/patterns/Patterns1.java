package loops.patterns;

public class Patterns1 {
  public static void main(String[] args) {
    for(int i = 1; i<=5; i++) {
      for(int j = 1; j<=5; j++) {
        System.out.print(j + " ");
      }
      System.out.println();
    }

    System.out.println();
    
    for(int i = 1; i<=5; i++) {
      for(int j =1; j<=5; j++) {
        System.out.print(i + " ");
      }
      System.out.println();
    }

    System.out.println();

    for(int i = 1; i<=5; i++) {
      for(int j =1;j<=5; j++) {
        System.out.print(j+i + " ");
      }
      System.out.println();
    }

    System.out.println();
    int count = 1;
    for(int i =1; i<=5; i++) {
      for(int j =1; j<=5; j++) {
        // System.out.print(count++ + "  ");
        // System.out.printf("%2d ", count++);
        System.out.format("%02d ", count++);
      }
      System.out.println();
    }

  }
}
