package arrays;

public class IncreaseArraySize {
  public static void main(String[] args) {
    int A[] = {8,6,10,9,2};
    int B[] = new int[2*A.length];

    for(int x:A) {
      System.out.print(x + ",");
    }
    System.out.println();
    for(int x:B) {
      System.out.print(x + ",");
    }
    System.out.println();

    for(int i = 0; i< A.length; i++) {
      B[i] = A[i];
    }
    A = B;
    B = null;

    System.out.println();
    System.out.println("====================================");
    System.out.println(B);
    for(int x:A) {
      System.out.print(x + ",");
    }
    System.out.println();
  }
}
