package arrays;

public class TwoDArray {
  public static void main(String[] args) {
    // int A[][] = new int[3][4];
    // int C[][]; C= new int[5][5];
    // int [][]D = new int[5][5];
    // int[][] D = new int[5][5];
    // int[] D[] = new int[5][5];
    // int []D[] = new int[5][5];
    // int[] E, F[];
    // E = new int[3];   // E is a single dimension array
    // F = new int[3][4];  // F is 2D array
    int A[][] = {{1,2,3,4}, {2,4,6,8},{3,5,7,9}};
    System.out.println(A);
    for(int i = 0; i<A.length; i++) {
      //System.out.println(A[i]);
      for(int j = 0; j < A[i].length; j++){
        System.out.print(A[i][j] + " ");
      }
      System.out.println();
    }


    // print using for each loop: 
    System.out.println("==============");
    for(int x[]: A) {
      for(int y : x) {
        System.out.print(y);
      }
      System.out.println();
    }

    System.out.println();

    // Jagged array
    System.out.println("========Jagged Array========");
    int B[][];
    B = new int[3][];
    B[0] = new int[5];
    B[1] = new int[3];
    B[2] = new int[8];
    for(int i =0; i<B.length; i++) {
      for(int j = 0; j<B[i].length; j++) {
        System.out.print(B[i][j] + " ");
      }
      System.out.println();
    }
    System.out.println();
    // using for each loop
    for(int x[]:B) {
      for(int y:x) {
        System.out.print(y + " ");
      }
      System.out.println();
    }

    System.out.println();

    // Sum of two matrices
    int P[][] = {{3,5,9}, {7,6,2},{4,3,5}};
    int Q[][] = {{1,5,2}, {6,8,4}, {3,9,7}};
    int R[][] = new int[3][3];
    for(int i = 0; i<P.length; i++) {
      for(int j = 0; j< P[0].length; j++) {
        R[i][j] = P[i][j] + Q[i][j];
        System.out.print(R[i][j] + " ");
      }
      System.out.println();
    }

    System.out.println("================");

    // Multiplication of matrices : P*Q
    for(int x[] :P) {
      for(int y: x) {
        System.out.print(y + " ");
      }
      System.out.println();
    }
    for(int x[] :Q) {
      for(int y: x) {
        System.out.print(y + " ");
      }
      System.out.println();
    }
    int S[][] = new int[3][3];
    for(int i =0; i<P.length; i++) {
      for(int j =0; j<Q[0].length; j++) {
        int sum = 0;
        for(int k = 0; k<Q.length; k++) {
          sum = sum + P[i][k] * Q[k][j];
        }
        S[i][j] = sum;
      }
    }
    for(int x[] : S) {
      for(int y : x) {
        System.out.print(y + " ");
      }
      System.out.println();
    }

  }
}
