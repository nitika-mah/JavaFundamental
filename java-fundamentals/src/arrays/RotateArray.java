package arrays;

public class RotateArray {
  public static void main(String[] args) {
    int A[] = {5, 9, 6, 10, 12, 7, 3, 5, 4, 2};
    for(int x:A){
      System.out.print(x + ", ");
    }
    System.out.println();
    // LEFT ROTATE THE ARRAY
    int temp = A[0];
    for(int i =0; i<A.length-1; i++) {
      A[i] = A[i+1];
    }
    A[A.length-1] = temp;
    for(int x:A) {
      System.out.print(x + ", ");
    }

    System.out.println();
    int B[] = {5, 9, 6, 10, 12, 7, 3, 5, 4, 2};
    // Right rotate the array
    int tem = B[B.length-1];
    for(int i = B.length-1; i>=1; i--) {
      B[i] = B[i-1];
    }
    B[0] = tem;
    for(int x:B) {
      System.out.print(x + ", ");
    }

    System.out.println();
    System.out.println("===================================================");

    //Q. Inserting a new element at a given index in array
    int C[] = new int[10];
    C[0]=5; C[1]= 9; C[2] = 6; C[3]=10; C[4]=12; C[5]=7;      // C = 5,9,6,10,12,7,-,-,-,-
    // insert 15 at index 2
    for(int x : C) {
      System.out.print(x + ",");
    }
    System.out.println();
    int elem = 15, index =2;
    for(int i = 5; i>=2; i--) {
      C[i+1] = C[i];
    }
    C[index] = elem;
    for(int x : C) {
      System.out.print(x + ",");
    }

    System.out.println();
    System.out.println(" +++++++++++++++++++++++++++++++ ");

    //Q. Deleting an element from an array
    int[] D = {5,9,6,10,12,7};  // delete elem at index 2
    for(int i = 2; i< D.length-1; i++) {
      D[i] = D[i+1];
    }
    for(int x : D){
      System.out.print(x + ",");
    }
  }
}
