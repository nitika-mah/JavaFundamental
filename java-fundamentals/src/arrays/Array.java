package arrays;

public class Array {
  public static void main(String[] args) {
    int A[] = new int[10];   // A is a reference of an array
    int B[] = {1,2,3,4,5};
    int C[];
    C = new int[5];

    int []D = new int[5];
    int[] E = new int[6];

    // change the value 3 in array B to 15
    B[2] = 15;
    for(int i = 0 ; i<B.length; i++) {
      System.out.println(B[i]);
    }

    for(int x: B) {
      System.out.println(x);
    }

    for(int x: B) {
      System.out.println(x++);   // by changing x we cannot change the elements of the array
    }
    for(int x: B) {
      System.out.println(x);
    }

    for(int i = 0;i<B.length;i++) {
      System.out.println(B[i]++);   // the array values can be modified using this
    }

    for(int x: B) {
      System.out.println(x);
    }

    System.out.println(B);

  }
}
