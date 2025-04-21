package methods;

public class ObjectAsParameter {

  static void update(int B[]) {
    B[0] = 25;
  }

  public static void main(String[] args) {
    int A[] = {2, 3, 4, 5, 6}; 
    update(A);
    change(A, 2, 23);
    for(int x: A) {
      System.out.println(x);
    }

    // primitive type : 
    int x = 10;
    change2(x, 12);
    System.out.println(x);

  }

  static void change(int A[], int index, int value) {
    A[index] = value;
  }

  static void change2(int x, int value) {
    x = value;
  }
  
}
