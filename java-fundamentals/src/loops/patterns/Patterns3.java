package loops.patterns;

public class Patterns3 {
  public static void main(String[] args) {
    for(int i =1; i<=5; i++){
      for(int j =1; j<=5; j++){
        if(i<=j) {
          System.out.print("* ");
        } else {
          System.out.print( "  ");
        }
      }
      System.out.println();
    }

    System.out.println();

    for(int i =1; i<=5; i++) {
      for(int j = 1; j<=5; j++) {
        if(j<=5-i){
          System.out.print("  ");
        }else{
          System.out.print("* ");
        }
      }
      System.out.println();
    }

    System.out.println();

    for(int i =1; i<=4; i++) {
      for(int j =1; j<=7; j++) {
        if(j<=4-i || j>=4+i) {
          System.out.print("  ");
        } else {
          System.out.print("* ");
        }
      }
      System.out.println();
    }
  }
}
